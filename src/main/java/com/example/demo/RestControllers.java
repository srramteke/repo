package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	@Autowired
	private Repo repo;
	
	@PostMapping(value = "/data",consumes = {"application/xml","application/json"})
	public ResponseEntity<String> save(@RequestBody Books books){
		
		System.out.println(books);
		
		Books save = repo.save(books);
		
		return new ResponseEntity<String>("save",HttpStatus.OK);
	}
}