package org.task3.model;


public record Person(String name, String surname, String patronymic, String phoneNumber) {
    @Override
    public String toString() {
        return  "<" + surname + "><" + name + "><" + patronymic + "><" +  phoneNumber + ">";
    }
}
