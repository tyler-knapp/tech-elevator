package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {

    private HotelReservation reservationTests;

    @Before
    public void setup(){
        reservationTests = new HotelReservation();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void get_estimated_total_calculation_for_4_nights (){
        //Arrange
        HotelReservation test = new HotelReservation("Ritz", 4);

        double expectedResult = 4 * 59.99;
        //Act
        double result = reservationTests.getEstimatedTotal();
        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void get_actual_total_calculation_ (){
        //Arrange
        int nums = reservationTests.getNumberOfNights();
        HotelReservation hotelTester = new HotelReservation("Ritz", 4);
        double expected = 4 * 59.99;
        //Act
        double result = reservationTests.actualTotal(false,false);
        //Assert
        Assert.assertEquals(expected,result);
    }

}
