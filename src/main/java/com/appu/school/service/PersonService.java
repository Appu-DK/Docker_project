package com.appu.school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appu.school.entity.Person;


public interface PersonService {

	
	public List<Person> findAll();

	public Person save(Person p);
	

}
