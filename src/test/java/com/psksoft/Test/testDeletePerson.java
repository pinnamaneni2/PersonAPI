package com.psksoft.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import com.psksoft.Test.Bean.Person;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class testDeletePerson {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	TestRestTemplate testRestTemplate;
	
	public void testdeletePerson() throws MalformedURLException {
		
		Person p = new Person(6,"santhi satish");
		String url = new URL("http://localhost:"+port+"/person/deleteperson").toString();
		HttpHeaders hh = new HttpHeaders();
		hh.set("","");
		HttpEntity<Person> entity = new HttpEntity<Person>(p, hh);
		testRestTemplate.put(url, entity, Person.class);
		
	}

}
