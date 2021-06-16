package com.example.ahmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping("")
    public String index(){
      return "hello client! kefak sho alakhbar";
	}
	
	@RequestMapping("random")
    public String index1(){
      return "Spring Boot is great";
	}
}
