package com.codingdojo.Languages.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Languages.model.Language;

public interface LanguageRepo extends CrudRepository<Language, Long> {
	 List<Language> findAll();
	 Optional<Language> findById(Long id); 
//	    List<Language> findByDescriptionContaining(String search);
//	  
//	    Long countByTitleContaining(String search);
//	   
//	    Long deleteByTitleStartingWith(String search);
}
