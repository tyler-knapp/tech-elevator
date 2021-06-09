package com.techelevator;

public class HotelReservation {

    private String name;
    private int numberOfNights;


    public HotelReservation(String name, int numberOfNights) {
        this.name = name;
        this.numberOfNights = numberOfNights;
    }

    public double calculateActualTotal(boolean requiresCleaning, boolean usedMinibar) {

        double actualTotal = getEstimatedTotal();

        if (usedMinibar) {
            actualTotal += 12.99;
        }
        if (requiresCleaning) {
            actualTotal += 34.99;
            if (usedMinibar) {
                actualTotal += 34.99;
            }
        }
        return actualTotal;
    }

    public double getEstimatedTotal() {
        return numberOfNights * 59.99;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    @Override
    public String toString() {
        return "RESERVATION - " + this.name + " - " + getEstimatedTotal();
    }
}
