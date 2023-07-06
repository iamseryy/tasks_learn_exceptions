package org.task3.exception;

import java.io.IOException;

public class DataBaseException extends IOException {
    public DataBaseException(String message){
        super(message);
    }
}
