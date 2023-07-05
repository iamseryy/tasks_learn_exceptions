package org.task3.repository;

import org.task3.model.Person;

import java.util.HashSet;

public interface People {
    void add(Person person);
    HashSet<Person> findAll();
}
