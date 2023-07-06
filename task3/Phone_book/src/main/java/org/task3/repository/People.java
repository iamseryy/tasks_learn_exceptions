package org.task3.repository;

import org.task3.exception.DataBaseException;
import org.task3.model.Person;

import java.util.HashSet;

public interface People {
    void add(Person person) throws DataBaseException;
    HashSet<Person> findAll();
}
