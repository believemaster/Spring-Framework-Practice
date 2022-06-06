package com.yanik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/",  method = RequestMethod.GET )
	public String welcome() {
		return "hello";
	}
//	Model Approach
//	@RequestMapping("displayName") 
//	public String displayName(@RequestParam("firstName") String firstName, Model model) {
//		model.addAttribute("name", firstName);
//		return "displayName";
//	}
	
//	User either Model or ModelAndView approach (Both are same)
	
	//	 ModelAndView Approach
//	@RequestMapping("displayName") 			
	@GetMapping("displayName") 				// this will only handle the get Type request
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		
		Date date = new Date();
		
		List<String> names = new ArrayList<>();
		
		names.add("Jane");
		names.add("John");
		names.add("Judith");
		
		modelAndView.addObject("date", date);
		modelAndView.addObject("name", firstName);
		modelAndView.addObject("team", names);
		return modelAndView;
	}
}
