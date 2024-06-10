package com.appu.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appu.school.entity.Person;
import com.appu.school.service.PersonService;

@RestController
public class PersonController {
	
  @Autowired
  private  PersonService service;
	
	@PostMapping("/create")
	public Person savePerson(@RequestBody Person  p) {
		return service.save(p);
		
		
	}
	
	@GetMapping("/get")
	public List<Person> getAllPerson(){
		
		return service.findAll();
	}

}
