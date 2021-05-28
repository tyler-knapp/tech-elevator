package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

    //create private variable
    private CigarParty partyTime;

   /*
     cigars           isWeekend    result
     30                 false       false
     40                 false       true
     50                 false       true
     60                 false       true
     70                 false       false
     30                 true        false
     40                 true        true
     50                 true        true
     60                 true        true
     70                 true        true
     -40                true        false
     -40                false       false
    */

    @Before
    public void setup(){
        partyTime = new CigarParty();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void not_the_weekend_under_forty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(30,false);
        //Assert
        Assert.assertFalse( result );
    }
    @Test
    public void not_the_weekend_forty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(40,false);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void not_the_weekend_fifty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(50,false);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void not_the_weekend_sixty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(60,false);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void not_the_weekend_seventy_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(70,false);
        //Assert
        Assert.assertFalse( result );
    }

    @Test
    public void true_weekend_twenty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(20,true);
        //Assert
        Assert.assertFalse( result );
    }

    @Test
    public void true_weekend_forty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(40,true);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void true_weekend_fiftyfive_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(55,true);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void true_weekend_sixty_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(60,true);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void true_weekend_hundred_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(100,true);
        //Assert
        Assert.assertTrue( result );
    }

    @Test
    public void true_weekend_negative_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(-40,true);
        //Assert
        Assert.assertFalse( result );
    }

    @Test
    public void false_weekend_negative_cigars(){
        //Arrange
        //Act
        boolean result = partyTime.haveParty(-40,false);
        //Assert
        Assert.assertFalse( result );
    }
}

