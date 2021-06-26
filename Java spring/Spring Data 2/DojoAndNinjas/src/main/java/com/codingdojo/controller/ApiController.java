package com.codingdojo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Dojo;
import com.codingdojo.models.Ninja;
import com.codingdojo.services.ApiService;



@Controller
public class ApiController {

	private final ApiService apiService;

	public ApiController(ApiService apiService) {
		super();
		this.apiService = apiService;
	}

	@RequestMapping("dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}

	@RequestMapping(value = "dojos/new", method = RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newdojo.jsp";
		} else {
			apiService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojo = apiService.allDojos();
		model.addAttribute("dojo", dojo);
		return "newninja.jsp";
	}
	
	@RequestMapping(value = "/ninjas/new", method = RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("hii");
			return "newninja.jsp";
		} else {
			System.out.println("hello");
			apiService.createNinja(ninja);
			return "redirect:/ninjas/new";
			
		}
	}
	
	
	@RequestMapping("/dojos/{id}")
	public String showDojo( Model model,@PathVariable("id")Long id) {
		Dojo dojo = apiService.dojoById(id);
		List<Ninja> ninjas = apiService.allNinjasInDojo(id);
		model.addAttribute("dojo",dojo);
		model.addAttribute("ninjas",ninjas);
		return "showdojo.jsp";
	}
		
	
}
