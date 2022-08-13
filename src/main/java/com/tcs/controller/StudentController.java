package com.tcs.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PostMapping(value = "/savedata",consumes = "Application/json")
	public String savrdata() {
		
		System.out.println("data save sucessfully");
		return null;
		
	}
	
	
}
