package org.task3.view.template.impl;

import org.task3.model.Person;
import org.task3.view.template.Template;

import java.util.HashSet;


public class DisplayAllContactTemplate implements Template {
    @Override
    public void output() {
        ui.output("\nDisplay all contact");

        HashSet<Person> people = personService.findPeople();

        if(people.size() == 0) {
            ui.output("\nPhone book is empty\n");
            ui.pressEnterToContinue();
        }

        people.stream()
                .sorted((person1, person2) -> person1.surname().compareTo(person2.surname()))
                .forEach(
                        person -> {
                            ui.output("\nSurname: " + person.surname());
                            ui.output("Name: " + person.name());
                            ui.output("Patronymic: " + person.patronymic());
                            ui.output("Phone number: " + person.phoneNumber());
                        }
                );

        ui.pressEnterToContinue();

    }
}
