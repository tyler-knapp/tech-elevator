package com.techelevator;

import org.junit.*;

public class HotelReservationTest {

    private HotelReservation reservation;

    @Before
    public void setupHotelReservation() {
        reservation = new HotelReservation("test", 2);
    }

    /*
    Test estimated total
     */
    @Test
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

    }

}
