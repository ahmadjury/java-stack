package com.codingdojo.Languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.Languages.model.Language;
import com.codingdojo.Languages.services.LanguageService;

@Controller
public class LangController {
    private final LanguageService langua;
    
    public LangController(LanguageService langua) {
        this.langua = langua;
    }

	   @RequestMapping("/")
	    public String index(Model model,@ModelAttribute("language") Language lang) {
	        List<Language> langs = langua.allLanguages();
	        model.addAttribute("langs", langs);
	        return "index.jsp";
	    }
	   
//	   @RequestMapping("/language")
//	    public String newLanguage(@ModelAttribute("language") Language lang) {
//	        return "index.jsp";
//	   }
	   @RequestMapping(value="/lang/create", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	langua.createLanguage(lang);
	            return "redirect:/";
	        }
	   }
	   @RequestMapping("/language/{id}/delete")
	   public String delete(@PathVariable("id")Long id) {
		   langua.deleteLanguage(id);
		   return "redirect:/";
	   }   
	   @RequestMapping("/language/{id}/edit")
	   public String edit(@PathVariable("id")Long id ,Model model,@ModelAttribute("language1") Language lang) {
		   Language language1 = langua.findLang(id);
		   model.addAttribute("language1",language1);
		   return "edit.jsp";
	   }
	   
	   @RequestMapping(value="/lang/{id}" , method = RequestMethod.PUT)
	   public String update(@Valid @ModelAttribute("language1") Language lang, BindingResult result) {
		   if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	        	langua.updateLanguage(lang);
	            return "redirect:/";
	        }
	   }
	   
	   @RequestMapping("/language/{id}")
	   public String show(@PathVariable("id")Long id,Model model ) {
		   Language lang = langua.findLang(id);
		   model.addAttribute("languages", lang);
		   return "show.jsp";
	   }
	    	
	   
	   
	   
}
