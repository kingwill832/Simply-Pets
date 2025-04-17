package com.SimplyPets.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvailController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Simply Pets, Have a great day!";
	}
	
}
