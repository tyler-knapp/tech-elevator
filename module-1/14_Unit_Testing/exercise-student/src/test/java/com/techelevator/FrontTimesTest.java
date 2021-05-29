package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

    /*
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
     * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
     * "AbcAbcAbc"
     */

    private FrontTimes firstThreeLettersNTimes;

    @Before
    public void setup(){
        firstThreeLettersNTimes = new FrontTimes();
    }

    @After
    public void cleanup(){

    }

    @Test
    //Arrange? Is there a need to setup?
    public void first_three_characters_Twice(){
        //Act
        String result = firstThreeLettersNTimes.generateString("Chocolate",2);
        //Assert
        Assert.assertEquals("ChoCho", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void first_three_characters_three_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("Chocolate",3);
        //Assert
        Assert.assertEquals("ChoChoCho", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void first_three_characters_zero_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("Chocolate",0);
        //Assert
        Assert.assertEquals("", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void only_one_characters_three_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("C",3);
        //Assert
        Assert.assertEquals("CCC", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void zero_characters_three_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("",3);
        //Assert
        Assert.assertEquals("", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void three_characters_negative_three_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("Front",-3);
        //Assert
        Assert.assertEquals("", result);
    }

    @Test
    //Arrange? Is there a need to setup?
    public void first_three_numbers_three_time(){
        //Act
        String result = firstThreeLettersNTimes.generateString("12345",3);
        //Assert
        Assert.assertEquals("123123123", result);
    }

}
