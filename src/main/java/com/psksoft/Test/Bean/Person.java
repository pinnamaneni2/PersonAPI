package com.psksoft.Test.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class Person {
	@Id 
	private Integer id;
	private String name;
	
	public Person(){}
	
}
