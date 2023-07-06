package org.task3.controller;

import org.task3.config.AppConfig;
import org.task3.view.menu.impl.GeneralMenuImpl;

import java.util.logging.Level;

public class AppController {
    public static void start(){
        AppConfig.LOGGER.log(Level.INFO, "Application started");

        new GeneralMenuImpl().processing();
    }


}