package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		
		return "helloworld";
	}
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		
		return "only return hello";
	}
	
	@ResponseBody
	@GetMapping("/hii")
	public String hii() {
		
		return "hii";
	}
}
