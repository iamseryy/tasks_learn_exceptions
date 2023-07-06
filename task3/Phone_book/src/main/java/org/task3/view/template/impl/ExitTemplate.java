package org.task3.view.template.impl;

import org.task3.config.AppConfig;
import org.task3.view.template.Template;

import java.util.logging.Level;

public class ExitTemplate implements Template {
    @Override
    public void output() {
        AppConfig.LOGGER.log(Level.INFO, "Application closed");
    }
}
