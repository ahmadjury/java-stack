package com.license.Services;

import org.springframework.stereotype.Service;
import com.license.models.License;
import com.license.models.Person;
import CascadeType.repositories.LicenseRepo;
import CascadeType.repositories.PersonRepo;

@Service
public class ApiService {
	private final PersonRepo personRepo;
	private final LicenseRepo licenseRepo;
	
	
	public ApiService (PersonRepo personRepo,LicenseRepo licenseRepo) {
		this.personRepo=personRepo;
		this.licenseRepo=licenseRepo;
	}
	

	public Person createPerson(Person person) {
		return personRepo.save(person);
	}	
	public License createLisence(License lisence) {
		return licenseRepo.save(lisence);
	}

	
}
