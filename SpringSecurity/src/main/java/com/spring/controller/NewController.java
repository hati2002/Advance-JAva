package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class NewController {

	@GetMapping("/greet/{yourName}")
	public String greet(@PathVariable("yourName") String yourName) {
		
		return "Hii"+" "+yourName;
	}
}
