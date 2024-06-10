package com.appu.school.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appu.school.entity.Person;
import com.appu.school.repo.PersonRepo;
import com.appu.school.service.PersonService;

@Service
public class PersonImpl implements PersonService {

	
	@Autowired
	PersonRepo personRepo;
	
	
	
	@Override
	public List<Person> findAll() {
		
		return personRepo.findAll();
	}

	@Override
	public Person save(Person p) {
		
		return personRepo.save(p);
	}
}
