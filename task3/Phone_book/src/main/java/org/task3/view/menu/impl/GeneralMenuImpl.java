package org.task3.view.menu.impl;

import org.task3.view.menu.GeneralMenu;
import org.task3.view.menu.Menu;

public class GeneralMenuImpl extends Menu implements GeneralMenu {
    public void processing() {
        super.processing(header, generalMenuItems);
    }
}