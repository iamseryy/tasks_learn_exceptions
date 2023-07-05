package org.task3.service.impl;

import org.task3.model.Person;
import org.task3.repository.People;
import org.task3.repository.impl.PeopleImpl;
import org.task3.service.PersonService;

import java.util.HashSet;

public class PersonServiceImpl implements PersonService {
    private static People people = PeopleImpl.getInstance();

    @Override
    public HashSet<Person> findPeople() {
        return people.findAll();
    }

    @Override
    public void add(Person person) {
        people.add(person);
    }
}
