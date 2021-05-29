package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {

    /*
         Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
         and 39 return true, but 40 returns false.
         (Hint: Think "mod".)
         less20(18) → true
         less20(19) → true
         less20(20) → false
     */

    private Less20 twoAwayFromMultiplesOf20;

    @Before
    public void setup(){
        twoAwayFromMultiplesOf20 = new Less20();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void two_away_from_20() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(18);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void two_away_from_40() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(38);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void three_away_from_20() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(17);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void three_away_from_60() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(63);
        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void two_away_from_0() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(2);
        //Assert
        Assert.assertFalse(result);
    }

    //Testing to make sure we cannot use negative number?
    //Technically -20 is a multiple of 20. This should return
    //true so I'm leaving this test as is.
    @Test
    public void two_away_from_negative_20() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(-18);
        //Assert
        Assert.assertTrue(result);
    }

    @Test
    public void eight_away_from_80() {
        //Act
        boolean result = twoAwayFromMultiplesOf20.isLessThanMultipleOf20(72);
        //Assert
        Assert.assertFalse(result);
    }


}


