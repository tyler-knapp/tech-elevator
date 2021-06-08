package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {

    private HotelReservation reservation;

    @Before
    public void setup(){
        reservation = new HotelReservation("test",2);
    }

    @After
    public void cleanup(){

    }


    /*
    Test estimated total
     */
    @Test
    public void estimated_total(){
        double actualTotal = reservation.getEstimatedTotal();
        //Arrange
        double expectedResult = 2 * 59.99;
        //Act
        //Assert
        Assert.assertEquals(expectedResult, actualTotal, .009 );
    }

    @Test
    public void actual_total_minibar_used_and_cleaning_required (){
        //Arrange
       double actualTotal = reservation.actualTotal(true, true);
       double expectedTotal = ((59.99 * 2) + 12.99) + (34.99 * 2);
        //Assert
        Assert.assertEquals(expectedTotal,actualTotal,.009);
    }

    @Test
    public void actual_total_no_minibar_used_and_cleaning_required(){
        //Arrange
        double actualTotal = reservation.actualTotal(true, false);
        double expectedTotal = (59.99 * 2) + 34.99;
        //Assert
        Assert.assertEquals(expectedTotal,actualTotal,.009);
    }

    @Test
    public void actual_total_no_minibar_used_and_no_cleaning_required(){
        //Arrange
        double actualTotal = reservation.actualTotal(false, false);
        double expectedTotal = (59.99 * 2);
        //Assert
        Assert.assertEquals(expectedTotal,actualTotal,.009);
    }

}
