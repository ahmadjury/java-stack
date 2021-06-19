package com.example.ahmad;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Random;

@Controller
public class Home {
	public static int gold;

	@RequestMapping("")
	public String home(HttpSession session) {
		if (session.isNew()) {
			gold = 0;
			session.setAttribute("gold",gold);
			return "home.jsp";
		}
		else {
		session.setAttribute("gold",gold);
		return "home.jsp";
		}
	}
	
	@RequestMapping(value="/processing", method=RequestMethod.POST)
	public String processing(@RequestParam("form") String form,
							HttpSession session,RedirectAttributes redirectAttributes,
							Model model) {
		if (form.equals("farm")) {
			Random rand = new Random();
			int random = rand.nextInt(10)+10;
			gold+=random;
			redirectAttributes.addFlashAttribute("random",random);
			
			
		}
		else if (form.equals("cave")) {
			Random rand = new Random();
			int random = rand.nextInt(10-5)+5;
			gold+=random;
			redirectAttributes.addFlashAttribute("random",random);
		}
		else if (form.equals("house")) {
			Random rand = new Random();
			int random = rand.nextInt(5-2)+2;
			gold+=random;
			redirectAttributes.addFlashAttribute("random",random);
		}
		else if (form.equals("casino")) {
			Random rand = new Random();
			int random = rand.nextInt(50+50)-50;
			gold+=random;
			redirectAttributes.addFlashAttribute("random",random);
		}
		
		session.setAttribute("gold",gold);
		
		java.util.Date date = new  java.util.Date();
	    SimpleDateFormat myFormatObj = new SimpleDateFormat("EEEE dd MMM  yyyy h:mm a"); 
	    String fdate=myFormatObj.format(date);
		session.setAttribute("date",fdate);
		redirectAttributes.addFlashAttribute("var",form);
		
		
		return "redirect:/";
		
		
	}
}
