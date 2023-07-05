package org.task3.view.menu;

import org.task3.view.template.impl.AddContactTemplate;
import org.task3.view.template.impl.DisplayAllContactTemplate;
import org.task3.view.template.impl.ExitTemplate;

import java.util.Arrays;
import java.util.List;

public interface GeneralMenu {
    String header = "\nPhone Book\n";
    List<MenuItem> generalMenuItems = Arrays.asList(
            new MenuItem[] {
                    new MenuItem("1 Add contact", () -> new AddContactTemplate().output()),
                    new MenuItem("2 Display all contact", () -> new DisplayAllContactTemplate().output()),
                    new MenuItem("3 Exit", () -> new ExitTemplate().output())
            }
    );
}