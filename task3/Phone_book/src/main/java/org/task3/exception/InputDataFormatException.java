package org.task3.exception;

import java.io.IOException;

public class InputDataFormatException extends IOException {
    public InputDataFormatException(String message){
        super(message);
    }
}
