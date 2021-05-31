package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of strings, return a Dictionary<string, int> with a key for
 * each different string, with the value the number of times that string appears
 * in the array.
 *
 * ** A CLASSIC **
 *
 * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
 * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * getCount([]) → {}
 * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
 *
 */

public class WordCountTest {

    private WordCount wordcount;

    @Before
    public void setup(){
        wordcount = new WordCount();
    }

    @After
    public void cleanup(){

    }

   @Test
   public void a_repeats_twice_b_repeats_twice_c_repeats_once(){
       //Arrange
       String[] testArray = {"a", "b", "a", "c", "b", };

       Map<String, Integer> expectedResult = new HashMap<String, Integer>();
       expectedResult.put("a", 2);
       expectedResult.put("b", 2);
       expectedResult.put("c", 1);

       //Act
       Map<String, Integer> result = wordcount.getCount(testArray);

       //Assert
       Assert.assertEquals(expectedResult, result);
   }

    @Test
    public void array_length_4_3_different_words(){
        //Arrange
        String[] testArray = {"ba", "ba", "black", "sheep"};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("ba", 2);
        expectedResult.put("black", 1);
        expectedResult.put("sheep", 1);

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void empty_string_array_returns_empty_map(){
        //Arrange
        String[] testArray = {""};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("", 1);

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void two_empty_strings_and_word_repeats_three_times(){
        //Arrange
        String[] testArray = {"","","word", "word", "word"};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("", 2);
        expectedResult.put("word", 3);

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void null_string_array(){
        //Arrange
        String[] testArray = {};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void string_array_with_numbers(){
        //Arrange
        String[] testArray = {"123", "123", "456", "4", "456"};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("4", 1);
        expectedResult.put("123", 2);
        expectedResult.put("456", 2);

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void one_of_each_string(){
        //Arrange
        String[] testArray = {"c", "b", "a"};

        Map<String, Integer> expectedResult = new HashMap<String, Integer>();
        expectedResult.put("c", 1);
        expectedResult.put("b", 1);
        expectedResult.put("a", 1);

        //Act
        Map<String, Integer> result = wordcount.getCount(testArray);

        //Assert
        Assert.assertEquals(expectedResult, result);
    }

}
