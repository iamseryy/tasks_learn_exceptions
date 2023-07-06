package org.task3.controller;

import org.task3.config.AppConfig;
import org.task3.model.Person;
import org.task3.service.PersonService;
import org.task3.service.impl.PersonServiceImpl;
import org.task3.view.menu.impl.GeneralMenuImpl;

import java.util.logging.Level;

public class AppController {
    public static void start(){
        AppConfig.LOGGER.log(Level.INFO, "Application started");

        new GeneralMenuImpl().processing();

//        var personService = new PersonServiceImpl();
//
//        var people = personService.findPeople();
//        people.stream()
//                .sorted((person1, person2) -> person1.surname().compareTo(person2.surname()))
//                .forEach(person -> System.out.println(person.toString()));
//
//        personService.add(new Person("Oleg", "Bobrov", "Petrovich", 117776655));
//        personService.add(new Person("Sergei", "Bobrov", "Petrovich", 117776655));
//
//        people.stream()
//                .sorted((person1, person2) -> person1.surname().compareTo(person2.surname()))
//                .forEach(person -> System.out.println(person.toString()));
    }


}