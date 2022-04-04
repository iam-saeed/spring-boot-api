package com.example.demo.dao;

import java.util.*;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
       
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        String name = "FROM POSTGRES DB";
        return List.of(new Person(UUID.randomUUID(), name ));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return null;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
    
}
