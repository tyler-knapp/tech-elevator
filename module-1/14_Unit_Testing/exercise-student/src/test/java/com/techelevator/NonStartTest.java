package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
     Given 2 strings, return their concatenation, except omit the first char of each. The strings will
     be at least length 1.
     GetPartialString("Hello", "There") → "ellohere"
     GetPartialString("java", "code") → "avaode"
     GetPartialString("shotl", "java") → "hotlava"
     */

public class NonStartTest {

    private NonStart nonstarter;

    @Before
    public void setup(){
        nonstarter = new NonStart();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void hello_there_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("Hello","There");
        //Assert
        Assert.assertEquals("ellohere", result);
    }

    @Test
    public void shotl_java_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("shotl","java");
        //Assert
        Assert.assertEquals("hotlava", result);
    }

    @Test
    public void java_code_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("java","code");
        //Assert
        Assert.assertEquals("avaode", result);
    }

    @Test
    public void two_letter_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("ha","ab");
        //Assert
        Assert.assertEquals("ab", result);
    }

    @Test
    public void one_letter_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("a","b");
        //Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void string_of_numbers_test(){
        //arrange
        //act
        String result = nonstarter.getPartialString("12345","67890");
        //Assert
        Assert.assertEquals("23457890", result);
    }

}
