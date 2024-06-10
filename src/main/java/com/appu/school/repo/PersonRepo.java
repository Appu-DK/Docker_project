package com.appu.school.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appu.school.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
