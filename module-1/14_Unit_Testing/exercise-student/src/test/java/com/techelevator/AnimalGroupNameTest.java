package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {

    private AnimalGroupName animalGroup;

    @Before
    public void setup(){
        animalGroup = new AnimalGroupName();
    }

    @After
    public void cleanup(){

    }

    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * GetHerd("giraffe") → "Tower"
     * GetHerd("") -> "unknown"
     * GetHerd("walrus") -> "unknown"
     * GetHerd("Rhino") -> "Crash"
     * GetHerd("rhino") -> "Crash"
     * GetHerd("elephants") -> "unknown"
     *
     */


    @Test
    public void animal_not_in_map_returns_unknown(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("spider");
        //Assert
        Assert.assertEquals("unknown",result);

    }

    @Test
    public void empty_string_returns_unknown(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("");
        //Assert
        Assert.assertEquals("unknown",result);

    }
    @Test
    public void rhino_uppercase_returns_crash(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("RHINO");
        //Assert
        Assert.assertEquals("Crash",result);

    }
    @Test
    public void rhino_lowercase_returns_crash(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("rhino");
        //Assert
        Assert.assertEquals("Crash",result);

    }
    @Test
    public void rhino_uppercase_and_lowercase_returns_crash(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("RHiNo");
        //Assert
        Assert.assertEquals("Crash",result);

    }

    @Test
    public void giraffe_uppercase_returns_Tower(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("GIRAFFE");
        //Assert
        Assert.assertEquals("Tower",result);
    }

    @Test
    public void giraffe_lowercase_returns_tower(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("giraffe");
        //Assert
        Assert.assertEquals("Tower",result);
    }

    @Test
    public void giraffe_uppercase_and_lowercase_returns_tower(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("GirAffe");
        //Assert
        Assert.assertEquals("Tower",result);

    }

    @Test
    public void elephant_lowercase_returns_herd(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("elephant");
        //Assert
        Assert.assertEquals("Herd",result);

    }
    @Test
    public void elephant_uppercase_returns_herd(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("ELEPHANT");
        //Assert
        Assert.assertEquals("Herd",result);

    }

    @Test
    public void elephant_uppercase_and_lowercase_returns_herd(){
        //Arrange
        //Act
        String result = animalGroup.getHerd("ELEphant");
        //Assert
        Assert.assertEquals("Herd",result);

    }

}
