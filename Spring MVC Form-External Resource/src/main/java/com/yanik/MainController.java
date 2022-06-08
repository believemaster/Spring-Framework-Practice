package com.yanik;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yanik.model.User;

@Controller
public class MainController {
	
	@GetMapping("/" )
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		
//		Dynamically Generate Form Input Gender
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");		// key value that is dynamically added into the radio button
		genderMap.put("female", "Female");
		
//		Dynamically Generate Select Input Country
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("Canada", "Canada");
		countryMap.put("USA", "United States");
		countryMap.put("Russia", "Russia");
		countryMap.put("Dubai", "Dubai");
		
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("countryMap", countryMap);

		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		
//		System.out.println(user);
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
}
