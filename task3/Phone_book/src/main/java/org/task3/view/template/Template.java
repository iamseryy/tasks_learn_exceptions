package org.task3.view.template;

import org.task3.service.PersonService;
import org.task3.service.impl.PersonServiceImpl;
import org.task3.view.ui.UserInterface;
import org.task3.view.ui.impl.UserInterfaceImpl;

public interface Template<T> {
    PersonService personService = new PersonServiceImpl();
    UserInterface ui = new UserInterfaceImpl();
    void output();
}