package com.techelevator;

<<<<<<< HEAD
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
=======
import org.junit.*;
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13

public class HotelReservationTest {

    private HotelReservation reservation;

    @Before
<<<<<<< HEAD
    public void setup(){
        reservation = new HotelReservation("test",2);
    }

    @After
    public void cleanup(){

    }


=======
    public void setupHotelReservation() {
        reservation = new HotelReservation("test", 2);
    }

>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
    /*
    Test estimated total
     */
    @Test
<<<<<<< HEAD
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
=======
    public void estimated_total() {
        double actualTotal = reservation.getEstimatedTotal();
        Assert.assertEquals(59.99 * 2, actualTotal, .009);
    }

    /*
    Test actual Total
     */
    @Test
    public void actual_total_minibarused_and_cleaning_required() {
        // Calcaulate the expected result
        double expectedTotal = ((59.99 * 2) + 12.99) + (34.99 * 2);

        double actualTotal = reservation.calculateActualTotal(true, true);

        Assert.assertEquals(expectedTotal, actualTotal, .009);

    }

    @Test
    public void actual_total_minibarused_and_no_cleaning_required() {
        // Calcaulate the expected result
        double expectedTotal = ((59.99 * 2) + 12.99);

        double actualTotal = reservation.calculateActualTotal(false, true);

        Assert.assertEquals(expectedTotal, actualTotal, .009);

    }

    @Test
    public void actual_total_no_minibarused_and_cleaning_required() {
        // Calcaulate the expected result
        double expectedTotal = (59.99 * 2) + (34.99);

        double actualTotal = reservation.calculateActualTotal(true, false);

        Assert.assertEquals(expectedTotal, actualTotal, .009);

    }

    @Test
    public void actual_total_no_minibarused_and_no_cleaning_required() {
        // Calcaulate the expected result
        double expectedTotal = (59.99 * 2);

        double actualTotal = reservation.calculateActualTotal(false, false);

        Assert.assertEquals(expectedTotal, actualTotal, .009);

>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
    }

}
