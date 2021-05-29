package com.techelevator.fizzbuzz;

public class FizzBuzz {

    /*
    Given a number
    Return Fizz if the number is a multiple of 3
    Return Buzz if the number is a multiple of 5
    Return FizzBuzz if the number is a multiple of both 3 and 5
    Otherwise return the original number
     */

    public String fizzBuzzIt(int number) {

        if(number % 5 == 0 && number% 3 == 0){
            return "FizzBuzz";
        }

        if(number % 3 ==0){
            return "Fizz";
        }

        if(number % 5 == 0){
            return "Buzz";
        }

        return null;

    }

}
