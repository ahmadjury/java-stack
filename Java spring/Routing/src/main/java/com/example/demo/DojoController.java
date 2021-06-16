package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {


	@RequestMapping("{dojo}")
	public String dojo(@PathVariable("dojo")String track){
		if(track.equals("dojo")){
		return "The dojo is awesome";
		}
		if(track.equals("burbank-dojo")){
		return " Burbank Dojo is located in Southern California";
		}	
		if(track.equals("san-jose")){
		return"SJ dojo is the headquarters";
		}
	return "no"	;
	}
}