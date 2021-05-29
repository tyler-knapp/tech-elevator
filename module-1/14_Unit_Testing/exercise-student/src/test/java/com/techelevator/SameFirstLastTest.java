package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {

    private SameFirstLast samefirstlast;

    @Before
    public void setup(){
        samefirstlast = new SameFirstLast();
    }

    @After
    public void cleanup(){

    }

    /*
     Given an array of ints, return true if the array is length 1 or more, and the first element and
     the last element are equal.
     IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */

    @Test
    public void array_length_4_same_first_and_last(){
        //Arrange
        int[] testArray = { 1, 2, 3, 1};
        //Act
        boolean result = samefirstlast.isItTheSame(testArray);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_length_1(){
        //Arrange
        int[] testArray = {8};
        //Act
        boolean result = samefirstlast.isItTheSame(testArray);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_length_0(){
        //Arrange
        int[] testArray = {};
        //Act
        boolean result = samefirstlast.isItTheSame(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void array_length_6_different_first_and_last(){
        //Arrange
        int[] testArray = {1,2,3,4,5,6};
        //Act
        boolean result = samefirstlast.isItTheSame(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void array_length_5_same_negative_numbers(){
        //Arrange
        int[] testArray = {-4,5,8,3,-4};
        //Act
        boolean result = samefirstlast.isItTheSame(testArray);
        //Assert
        Assert.assertTrue(result);
    }

}
