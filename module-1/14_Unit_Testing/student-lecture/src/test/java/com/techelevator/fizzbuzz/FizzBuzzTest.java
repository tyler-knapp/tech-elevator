package com.techelevator.fizzbuzz;

 /*
    Given a number
    Return Fizz if the number is a multiple of 3
    Return Buzz if the number is a multiple of 5
    Return FizzBuzz if the number is a multiple of both 3 and 5
    Otherwise return the original number
     */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void createBuzzTest(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void fizz_if_number_multiple_of_three(){
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzIt(3));
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzIt(9));
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzIt(-3));
        Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzIt(-6));
    }

    @Test
    public void buzz_if_multiple_of_five(){
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzIt(5));
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzIt(10));
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzIt(-5));
        Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzIt(-20));
    }

    @Test
    public void fizzbuzz_if_mulitple_of_three_and_five(){
        Assert.assertEquals("FizzBuzz",fizzBuzz.fizzBuzzIt(15));
    }



}
