package org.task3.service;

import org.task3.exception.DataBaseException;
import org.task3.model.Person;

import java.util.HashSet;

public interface PersonService {
    HashSet<Person> findPeople();
    void add(Person person) throws DataBaseException;
}
