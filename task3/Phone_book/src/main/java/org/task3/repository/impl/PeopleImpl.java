package org.task3.repository.impl;

import org.task3.config.AppConfig;
import org.task3.exception.DataBaseException;
import org.task3.model.Person;
import org.task3.repository.People;
import org.task3.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;
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
    public void add(Person person) throws DataBaseException {
        if(this.people.contains(person)){
            return;
        }

        this.people.add(person);
        FileUtils.writeFile( person.toString() + "\n",
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
            people.add(new Person(values[1], values[0].replace("<", ""), values[2],
                    values[3].replace(">", "")));
        }

        return people;
    }
}
