package com.ellenmateus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@PostMapping(name = "/validate-password")
	public ResponseEntity<?> validatePassword(){
		
		
		return ResponseEntity.noContent().build();
	}

}
