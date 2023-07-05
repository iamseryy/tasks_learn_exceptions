package org.task3.repository.impl;

import org.task3.config.AppConfig;
import org.task3.model.Person;
import org.task3.repository.People;
import org.task3.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class PeopleImpl implements People {
    private static HashSet<Person> people = initCollection();

    private static PeopleImpl instance;

    private PeopleImpl(){}

    public static PeopleImpl getInstance() {
        if (instance == null) {
            instance = new PeopleImpl();
        }
        return instance;
    }

    @Override
    public void add(Person person) {
        this.people.add(person);
        FileUtils.writeFile("\n" + person.toString(),
                new File(AppConfig.getPath("path.database") + "/" + person.surname()), true);
    }

    @Override
    public HashSet<Person> findAll() {
        return this.people;
    }

    private static HashSet<Person> initCollection() {
        var people = new HashSet<Person>();
        ArrayList<String> data = FileUtils.readFiles(AppConfig.getPath("path.database"));

        for (String line: data) {
            String[] values = line.split("><");
            String name = values[1];
            String surname = values[0].replace("<", "");
            String patronymic = values[2];
            values[3] = values[3].replace(">", "");
            long phoneNumber = Long.parseLong(values[3]);

            people.add(new Person(name, surname, patronymic, phoneNumber));
        }

        return people;
    }
}
