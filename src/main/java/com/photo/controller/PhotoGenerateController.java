package com.photo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photo")
public class PhotoGenerateController {
	
	@PostMapping("/generate/v1")
	public void generateIDPhoto() {
		
	}
	
	@GetMapping("/validate/v1")
	public void validatePhoto() {
		
	}
	
}
