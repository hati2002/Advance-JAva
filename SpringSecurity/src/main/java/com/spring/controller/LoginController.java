package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/myCustomLogin")
	public String viewlogin() {
		
		return "login";
	}
}
