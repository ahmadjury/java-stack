package com.codingdojo.Languages.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.Languages.model.Language;
import com.codingdojo.Languages.services.LanguageService;





@RestController
public class LangApi {
	private final LanguageService languageService;

	public LangApi(LanguageService languageService) {
		this.languageService = languageService;
	}
	@RequestMapping(value="api/languages")
	List<Language> index(){
		return languageService.allLanguages();
	}
	@RequestMapping(value="api/languages/create",method=RequestMethod.POST)
	public Language createapi(@RequestParam(value = "name") String name,
			@RequestParam(value = "creator") String creator ,
			@RequestParam(value = "version") Double version) {
		return languageService.createLanguageapi(name,creator,version);
	
} 
}