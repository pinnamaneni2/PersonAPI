package com.psksoft.Test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.psksoft.Test.Bean.Person;

@Service
public interface PersonService {

	Person getPerson(Integer id);
	List<Person> getAllPerson();
	void savePerson(Person p);
	void deletePerson(Person p);
	
	
}
