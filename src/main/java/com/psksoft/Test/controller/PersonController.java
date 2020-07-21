package com.psksoft.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psksoft.Test.Bean.Person;
import com.psksoft.Test.service.PersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	PersonServiceImpl psi;
	@GetMapping(value = "/")
	String getHello() {
		return "Hello String";
	}
	
	@GetMapping(value ="/person/{id}")
	public Person getPerson(@PathVariable Integer id) {
		return psi.getPerson(id);
	}
	
	@GetMapping(value ="/person/all")
	public List<Person> getAllPerson(){
		return psi.getAllPerson();
	}
	
	@PostMapping(value ="/person/saveperson")
	public void savePerson(@RequestBody Person person){
		psi.savePerson(person);
	}
	
	@PutMapping(value ="/person/deleteperson")
	public void  updatePerson(@RequestBody Person person) {
		 psi.deletePerson(person);
	}
	

}
