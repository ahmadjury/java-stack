package com.codingdojo.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.codingdojo.Languages.model.Language;
import com.codingdojo.Languages.repositories.LanguageRepo;


@Service
public class LanguageService {

	private final LanguageRepo langRepo;
	
	public LanguageService(LanguageRepo langRepo) {
		this.langRepo = langRepo;
	}
	public List<Language> allLanguages(){
		return langRepo.findAll();
	}
	
	public Language createLanguageapi(String name,String creator,Double version ) {
		Language la = new Language();
		la.setName(name);
		la.setCreator(creator);
		la.setVersion(version);
		return langRepo.save(la);
	}
	public Language findLang(Long id) {
		Optional<Language> optionalLanguage = langRepo.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}else {
			return null;
		}
	}
	
	public Language createLanguage(Language l) {
		return langRepo.save(l);
	}

	public void deleteLanguage(Long id ) {
		langRepo.deleteById(id);
	}
	public Language updateLanguage( @ModelAttribute("language1") Language lang ) {
		Language newlang = findLang(lang.getId());
		 newlang.setName(lang.getName());
		 newlang.setCreator(lang.getCreator());
		 newlang.setVersion(lang.getVersion());
		 langRepo.save(newlang);
		 return newlang;
	}
}
