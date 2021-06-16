package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {

	 @RequestMapping("coding")
	    public String index() {
		 return "Hello Coding Dojo!";
	    }
	 @RequestMapping("coding/python")
	    public String index1() {
		 return "Python/Django was awesome!";
	    }
	 @RequestMapping("coding/java")
	    public String index2() {
		 return "Java/Spring is better!";
	    }
}
