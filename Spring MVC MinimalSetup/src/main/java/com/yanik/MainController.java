package com.yanik;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value="/",  method = RequestMethod.GET )
	public String welcome() {
		return "hello";
	}
	
	@RequestMapping(value="displayName") //because form defaul value is GET so RequestMethod is skipped
	public String displayName(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		request.setAttribute("firstName", firstName);
		return "displayName";
	}
}
