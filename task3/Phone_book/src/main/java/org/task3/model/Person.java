package org.task3.model;


public record Person(String name, String surname, String patronymic, long phoneNumber) {
    @Override
    public String toString() {
        return  "<" + surname + "><" + name + "><" + patronymic + "><" +  phoneNumber + ">";
    }
}
