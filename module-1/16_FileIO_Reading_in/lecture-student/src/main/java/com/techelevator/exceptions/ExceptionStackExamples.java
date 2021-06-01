package com.techelevator.exceptions;

import java.awt.image.VolatileImage;

public class ExceptionStackExamples {

    public static void main(String[] args) {

        try {
            throwsNullPointerException();
        } catch (NullPointerException e){
            System.out.println("String was null");
        }

    }

    private static void throwsNullPointerException(){
        methodA();
    }

    private static void methodA(){
        methodB();
    }

    private static void methodB(){
        methodC();
    }

    /*
    Exceptions when thrown can be caught in any method in the current
    call stack. They do not need to be caught here, but can be caught in methods
    that call this method.
     */
    private static void methodC(){
        String str = null;
        str.toUpperCase();
    }

}
