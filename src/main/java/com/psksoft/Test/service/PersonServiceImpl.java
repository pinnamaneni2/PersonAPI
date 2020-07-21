package com.psksoft.Test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psksoft.Test.Bean.Person;
import com.psksoft.Test.Respository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository pr;


	@Override
	public Person getPerson(Integer id) {
		List<Person> collect = pr.findAll().stream().filter(p->p.getId() == id).collect(Collectors.toList());
		if(collect.size() != 0) {
		return collect.get(0);
		}
		return null;
	}

	@Override
	public List<Person> getAllPerson() {
		return pr.findAll();
	}

	@Override
	public void savePerson(Person p) {
		pr.save(p);
	}

	@Override
	public void deletePerson(Person p) {
		pr.delete(p);
	}
	
	
}
