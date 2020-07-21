package com.psksoft.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.psksoft.Test.Bean.Person;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestPersonSave {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	public void testSavePerson() throws Exception {
		
		String url = new URL("http://localhost:" + port + "/person/saveperson").toString();
		
		Person p = new Person(11,"naga");
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-COM-LOCATION","USA");
		HttpEntity<Person> personEntity =new HttpEntity<>(p,headers);
		ResponseEntity<Person> postForEntity = testRestTemplate.postForEntity(url, personEntity, Person.class);
		assertEquals(HttpStatus.OK, postForEntity.getStatusCode());
		
		
	}
	

}
