package com.cbfacademy;


//Create a custom (checked) exception class called `FilenameException`

public class FilenameException extends Exception {

    public FilenameException(String message) {
        super(message);
    }
}
