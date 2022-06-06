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
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");		// key value that is dynamically added into the radio button
		genderMap.put("female", "Female");
		
		modelAndView.addObject("genderMap", genderMap);

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
