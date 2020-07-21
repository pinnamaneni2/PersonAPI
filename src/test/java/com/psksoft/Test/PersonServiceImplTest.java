package com.psksoft.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.psksoft.Test.Bean.Person;
import com.psksoft.Test.Respository.PersonRepository;
import com.psksoft.Test.service.PersonServiceImpl;

@SpringBootTest
public class PersonServiceImplTest {
	
	@Mock
	private PersonRepository  pr;
	
	@InjectMocks
	private PersonServiceImpl psi;
	
	@Test
	void testgetPerson() {
		List<Person> p = new ArrayList<Person>();
		
		Person p1 = new Person(5,"SATISH");
		Person p2 = new Person(6,"SASH");
		Person p3 = new Person(7,"SSH");
		Person p4 = new Person(8,"SHA");
		Person p5 = new Person(9,"SATI");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		when(pr.findAll()).thenReturn(p);
		
		assertEquals(5, psi.getAllPerson().size());
	}
	
	
	
}
