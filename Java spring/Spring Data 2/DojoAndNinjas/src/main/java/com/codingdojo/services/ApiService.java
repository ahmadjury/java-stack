package com.codingdojo.services;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.codingdojo.models.Dojo;
import com.codingdojo.models.Ninja;
import com.codingdojo.repositories.DojoRepo;
import com.codingdojo.repositories.NinjaRepo;

@Service
public class ApiService {
	
	
	private final NinjaRepo ninjaRepo;
	private final DojoRepo dojoRepo;
	
	
public ApiService(NinjaRepo ninjaRepo, DojoRepo dojoRepo) {
		this.ninjaRepo = ninjaRepo;
		this.dojoRepo = dojoRepo;
	}


public Ninja createNinja(Ninja ninja) {
	return ninjaRepo.save(ninja);
}
public Dojo createDojo(Dojo dojo) {
	return dojoRepo.save(dojo);
}

public List<Ninja> allNinjas(){
	return ninjaRepo.findAll();
}

public List<Dojo> allDojos(){
	return dojoRepo.findAll();	
}

public List<Ninja> allNinjasInDojo(Long id) {
	return ninjaRepo.findNinjaByDojoId(id);
}	

public Dojo dojoById(Long id) {
	return dojoRepo.findById(id).orElse(null);
}
}
