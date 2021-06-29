package com.codingdojo.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.models.Event;
import com.codingdojo.models.User;
import com.codingdojo.services.UserService;
import com.codingdojo.validation.UserValidator;

@Controller
public class UsersController {
    private final UserService userService;
    private final UserValidator userValidator;
    
    public UsersController(UserService userService , UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user,HttpSession session) {
    	if (session.getAttribute("userId")!=null) {
    		return "redirect:/home";
    	}
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    
    public String login(HttpSession session) {
    	if (session.getAttribute("userId")!=null) {
    		return "redirect:/home";
    	}
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session,Model model) {
        // if result has errors, return the registration page (don't worry about validations just now)
    	
    	userValidator.validate(user, result);
    	if(result.hasErrors()) {
    		return "registrationPage.jsp";
    	}
    	if (userService.findByEmail(user.getEmail())!=null) {
    		model.addAttribute("error","email already exist");
    		return "registrationPage.jsp";
    	}
    		
    	userService.registerUser(user);
    	session.setAttribute("userId", user.getId());
    	return "redirect:/home";
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(userService.authenticateUser(email,password)) {
    		Long id = userService.findByEmail(email).getId();
    		session.setAttribute("userId", id);
    		return "redirect:/home";
    	}
    	else {
    		model.addAttribute("error","Invalid User name or Password");
    		return "loginPage.jsp";
    	}
    }
  ////////////////////////////////////////////////////////////////////////////
    
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model,@ModelAttribute("event") Event event) {
        // get user from session, save them in the model and return the home page
    	if(session.getAttribute("userId")==null)
    		return "redirect:/home";
    	Long id = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(id);
    	String userstate = u.getState();
    	model.addAttribute("user", u);
    	List<Event> events = userService.sortEvents(userstate);
    	model.addAttribute("events", events);
    	model.addAttribute("idInSession", id);
    	return "homePage.jsp";
    }
    
    
    @PostMapping("/events/new")
    public String creatEvent(@ModelAttribute("event") Event event ) {
    	
    		userService.createEvent(event);
    		return"redirect:/home";
    	
    	 
    	
    }
  ///////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
    	return "redirect:/login";
    }
    
  ///////////////////////////////////////////////////////////////////////////////
    
}