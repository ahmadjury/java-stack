package com.example.ahmad;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dojo {
	@RequestMapping("")
	public String Form(){
		return "dojo.jsp";
	}

	@RequestMapping(value="/getdata", method=RequestMethod.POST)
	public String GetForm(HttpSession session,@RequestParam(value="name")String name,
			@RequestParam(value="Dojo_Location")String location,
			@RequestParam(value="Favorite_Language")String language,
			@RequestParam(value="comment")String comment) {
		session.setAttribute("name",name);
		session.setAttribute("location",location);
		session.setAttribute("language",language);
		session.setAttribute("comment",comment);
		return "redirect:/result";
	}

		@RequestMapping("/result")
		public String result(){
			return "result.jsp";
		}
		

}
