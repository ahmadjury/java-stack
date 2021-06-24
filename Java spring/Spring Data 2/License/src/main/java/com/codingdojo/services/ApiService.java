package com.codingdojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.License;
import com.codingdojo.models.Person;
import com.codingdojo.repositories.LicenseRepo;
import com.codingdojo.repositories.PersonRepo;

@Service
public class ApiService {

	private final PersonRepo PR;
	private final LicenseRepo LI;
	public ApiService(PersonRepo pR, LicenseRepo lI) {
		PR = pR;
		LI = lI;
	}
	
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = PR.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		}
		return null;
	}
	
	public List<Person> allPerson(){
		return PR.findAll();
	}
	
	public List<License> allLicinse(){
		return LI.findAll();
	}
	public Optional<License> licinseById(Long id){
		return LI.findById(id);
	}
	
	public Person creatPerson(Person person) {
		return PR.save(person);
	}
	
	public List<Person> personNoLicense() {
		return PR.findByLicenseIsNull();
	}
	public License createLicense(License l){
        License topNumber = LI.findTopByOrderByNumberDesc();
        int number;
        if (topNumber == null)
            number = 1;
        else {
            number = Integer.parseInt(topNumber.getNumber());
            number++;
        }
        String numberString = String.format("%05d",number);
        l.setNumber(numberString);
        return LI.save(l);
    }
}
