package com.example.demo.dao;

import com.example.demo.model.Person;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.Collection.stream;


@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
    
    private static List<Person> DB = new ArrayList<>();
    
    @Override
    public int insertPerson(UUID id, Person person){
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople(){
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        // TODO Auto-generated method stub
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }
}
