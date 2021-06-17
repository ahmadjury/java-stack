package com.example.ahmad;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Home {

	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String getCode(@RequestParam(value="code")String code) {
		if(code.equals("bushido")) {
			return "code.jsp";
		}
		else {return "redirect:/createError"; 
		}	
	}
		
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("error", "you must train harder!!!");
        return "redirect:/";
	    }	
	}
	
