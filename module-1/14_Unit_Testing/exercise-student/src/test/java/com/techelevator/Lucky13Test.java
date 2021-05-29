package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Lucky13Test {

    /*
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
     * 4]) → false
     */

    private Lucky13 lucky13;

    @Before
    public void setup(){
        lucky13 = new Lucky13();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void true_for_no_ones_or_threes(){
        //Arrange
        int[] testArray = {0, 2, 4};
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void false_for_one(){
        //Arrange
        int[] testArray = {0, 1, 4};
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void false_for_three(){
        //Arrange
        int[] testArray = {3, 0, 4, 5, 6, 7, 8, };
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void false_for_both_one_and_three(){
        //Arrange
        int[] testArray = {3, 1, 4, 9, 6, 1, 8 };
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void false_for_negative_one(){
        //Arrange
        int[] testArray = {0, 0, 4, 9, 6, -1, 8 };
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void false_for_negative_three(){
        //Arrange
        int[] testArray = {0, 0, 4, 9, 6, -3, 8 };
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void array_size_zero_(){
        //Arrange
        int[] testArray = {};
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_size_two_with_no_one_or_three(){
        //Arrange
        int[] testArray = {2,4};
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void array_size_one_with_one(){
        //Arrange
        int[] testArray = {1};
        //Act
        boolean result = lucky13.getLucky(testArray);
        //Assert
        Assert.assertFalse(result);
    }

}
