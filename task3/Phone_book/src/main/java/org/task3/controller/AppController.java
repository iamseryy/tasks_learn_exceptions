package org.task3.controller;

import org.task3.model.Person;
import org.task3.service.PersonService;
import org.task3.service.impl.PersonServiceImpl;

public class AppController {
    public static void start(){
        var personService = new PersonServiceImpl();

        var people = personService.findPeople();
        people.stream()
                .sorted((person1, person2) -> person1.surname().compareTo(person2.surname()))
                .forEach(person -> System.out.println(person.toString()));

        personService.add(new Person("Bobrov", "Oleg", "Petrovich", 117776655));

        people.stream()
                .sorted((person1, person2) -> person1.surname().compareTo(person2.surname()))
                .forEach(person -> System.out.println(person.toString()));
    }


}