package com.codingdojo.controllers;

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

import com.codingdojo.models.License;
import com.codingdojo.models.Person;
import com.codingdojo.services.ApiService;

@Controller
public class ApiController {
	private final ApiService apiService;

	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}

	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}

	@RequestMapping(value = "/persons/new", method = RequestMethod.POST)
	public String makeNewperson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "newperson.jsp";
		} else {
			apiService.creatPerson(person);
			return "redirect:/license/new";

		}
	}

	@RequestMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license,Model model) {
		List<Person> allpersons =apiService.personNoLicense();
		model.addAttribute("allpersons",allpersons);
		return "newlicense.jsp";
	}

	@RequestMapping(value= "/license/new", method=RequestMethod.POST)
	public String makenewlicense(@Valid@ModelAttribute("license") License license,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "newlicense.jsp";
		}
			else {
				apiService.createLicense(license);
				return "redirect:/person/"+license.getPerson().getId();

		}
		
	}
	
	@RequestMapping("/person/{id}")
	public String showPerson(Model model,@PathVariable("id")Long id) {
		Person person = apiService.findPerson(id);
		model.addAttribute("person", person);
		return "showdata.jsp";
	}
	
//	@RequestMapping("/showdata")
//		public String showdata(Model model) {
//		List<Person> allpersons= apiService.allPerson();
//		List<License> alllicense= apiService.allLicinse();
//		model.addAttribute("allpersons",allpersons);
//		model.addAttribute("alllicense",alllicense);
//		return "
//	}
	
}

