package com.cts;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@PostMapping("employee")
	public ResponseEntity<Object> register(@RequestBody @Valid Employee employee){
		
		
		
		return new ResponseEntity<>(employee,HttpStatus.OK);
		
	}
	
	

}
