package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	// expose "/" that returns "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " +LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		return "Run a hard 5k!";
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day!";
		}
	
}
