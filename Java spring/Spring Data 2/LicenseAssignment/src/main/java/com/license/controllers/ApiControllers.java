package com.license.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.license.Services.ApiService;

@Controller
public class ApiControllers {

	private final ApiService apiService;
	public ApiControllers (ApiService apiService) {
	this.apiService=apiService;
	}
	@RequestMapping("/persons/new")
	public String newPerson() {
		return "newperson.jsp";
	}
}
