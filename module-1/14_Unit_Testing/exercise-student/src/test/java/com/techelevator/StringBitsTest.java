package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {

    private StringBits bitsOfString;

    @Before
    public void setup(){
        bitsOfString = new StringBits();
    }

    @After
    public void cleanup(){

    }

    /*
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
     * → "H" GetBits("Heeololeo") → "Hello"
     */

    @Test
    public void get_every_other_letter_from_a_five_letter_word(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("Hello");
        //Assert
        Assert.assertEquals("Hlo", result);
    }

    @Test
    public void get_every_other_letter_from_a_two_letter_word(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("At");
        //Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void get_every_other_letter_from_one_letter(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("A");
        //Assert
        Assert.assertEquals("A", result);
    }

    @Test
    public void empty_string_returns_empty(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("");
        //Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void string_of_every_other_number(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("12345");
        //Assert
        Assert.assertEquals("135", result);
    }

    @Test
    public void string_of_words_with_spaces(){
        //Arrange
        //Act
        String result = bitsOfString.getBits("Hi there buds");
        //Assert
        Assert.assertEquals("H hr us", result);
    }
}
