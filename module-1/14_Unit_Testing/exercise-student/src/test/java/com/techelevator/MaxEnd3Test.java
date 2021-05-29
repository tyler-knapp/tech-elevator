package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

    private MaxEnd3 end3max;

    @Before
    public void setup(){
        end3max = new MaxEnd3();
    }

    @After
    public void cleanup(){

    }

     /*
     Given an array of ints length 3, figure out which is larger between the first and last elements
     in the array, and set all the other elements to be that value. Return the changed array.
     MakeArray([1, 2, 3]) → [3, 3, 3]
     MakeArray([11, 5, 9]) → [11, 11, 11]
     MakeArray([2, 11, 3]) → [3, 3, 3]
     */

    @Test
    public void array_size_three_largest_number(){
        //Arrange
        int[] testArray = {1,2,3};
        int[] expectedArray = {3,3,3};
        //Act
        int[] actualArray = end3max.makeArray(testArray);
        //Assert
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
