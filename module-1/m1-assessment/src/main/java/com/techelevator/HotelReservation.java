package com.techelevator;

public class HotelReservation {

    private String name;
    private int numberOfNights;
    private double estimatedTotal;

    public HotelReservation(String name, int numberOfNights){
        this.name = name;
        this.numberOfNights = numberOfNights;
    }

    public HotelReservation(){

    }

    public double actualTotal(boolean requiresCleaning, boolean usedMinibar){
        if(usedMinibar){
            estimatedTotal += 12.99;
        } else {
            estimatedTotal += 0.00;
        }

        if(requiresCleaning){
            estimatedTotal += 34.99;
        } else {
            estimatedTotal += 0.00;
        }

        if(usedMinibar && requiresCleaning){
            estimatedTotal += (12.99) + (34.99 * 2);
        } else{
            estimatedTotal += 0.00;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getEstimatedTotal() {
        return estimatedTotal = numberOfNights * 59.99;
    }

    @Override
    public String toString(){
        return "RESERVATION - " + getName() + " - " + getEstimatedTotal();
    }
}
