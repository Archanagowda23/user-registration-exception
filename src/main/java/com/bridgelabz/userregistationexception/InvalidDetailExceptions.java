package com.bridgelabz.userregistationexception;

public class InvalidDetailExceptions extends Exception{

    /**
     * enum is a special data type that enable for a variable to be a set of pre
     * defined constant
     *
     */
    enum ExceptionType {
        ENTERED_INVALID, ENTERED_NULL
    }

    ExceptionType type;

    /**
     * creating Parameterized constructor InvalidDetailExceptions by passing values
     *
     * @param type    -type of exception
     * @param message -passing message
     */
    public InvalidDetailExceptions(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

