package org.task3.exception;

import java.io.IOException;

public class InvalidPhoneNumberException extends IOException {
    public InvalidPhoneNumberException(String message){
            super(message);
        }
}
