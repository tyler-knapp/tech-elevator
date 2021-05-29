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

   // @Test
    //Arrange
    String[] testArray = {"Ba", "Ba", "Black", "Sheep"};



    //expected result = {"ba" : 2, "black": 1, "sheep": 1 }

    //(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }

    //Assert.assertEquals(expectedResult, actualResult);

}
