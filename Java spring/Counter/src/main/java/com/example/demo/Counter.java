package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Counter {
	@RequestMapping("")
	public String homepage(HttpSession session) {
		
		   Integer count = (Integer) session.getAttribute("count");
		   if (count==null) {
			   session.setAttribute("count",0);
		   }
		   else { 
			   count++;
			   session.setAttribute("count", count);
		   }
		   
		return "index.jsp";
	}	
	@RequestMapping("reset")
	public String reset(HttpSession session) {
		session.setAttribute("count",-1);
		return "redirect:/";
	}
	@RequestMapping("/counter")
	public String countr() {
		
	return "counter.jsp";	
	}
	
	
}
