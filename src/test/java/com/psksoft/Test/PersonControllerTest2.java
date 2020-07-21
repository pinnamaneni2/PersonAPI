package com.psksoft.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.psksoft.Test.Bean.Person;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PersonControllerTest2 {
	@LocalServerPort
	private int port;

	@Autowired
	TestRestTemplate trt;

	@Test
	public void testGetPerson() throws Exception {
		Map<String, Integer> urlParams = new HashMap<String, Integer>();
		urlParams.put("id",2);
		ResponseEntity<Person> forEntity = trt.getForEntity(new URL("http://localhost:" + port + "/person/{id}").toString(),
				Person.class,urlParams);

		assertEquals("siri", forEntity.getBody().getName());
	}
	
	
}
