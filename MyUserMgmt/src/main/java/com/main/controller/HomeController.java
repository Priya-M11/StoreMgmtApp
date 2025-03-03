package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/testApi")
	public String ontest()
	{
		return "working";
	}

	@GetMapping("/testApi1")
	public String offtest()
	{
		return "working off";
	}
	
}
