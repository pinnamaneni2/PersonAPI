package com.psksoft.Test.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psksoft.Test.Bean.Person;
@Repository
public interface PersonRepository extends  JpaRepository<Person,Integer>{

}
