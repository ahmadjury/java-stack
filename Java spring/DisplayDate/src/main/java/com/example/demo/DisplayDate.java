package com.example.demo;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {
	@RequestMapping("")
	public String homepage() {
		return "index.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		java.util.Date time = new  java.util.Date();
	    SimpleDateFormat myFormatObj = new SimpleDateFormat("h:mm a"); 
	    String ftime=myFormatObj.format(time);
		model.addAttribute("time",ftime);
		return "time.jsp";
	}
	
	
	@RequestMapping("/date")
	public String date(Model model) {
		java.util.Date date = new  java.util.Date();
	    SimpleDateFormat myFormatObj = new SimpleDateFormat("EEEE dd MMM  yyyy"); 
	    String fDate=myFormatObj.format(date);
		model.addAttribute("date",fDate);
		return "Date.jsp";
	}
	
	
	
}
