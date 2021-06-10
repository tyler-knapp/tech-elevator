package com.techelevator;

public class HotelReservation {

    private String name;
    private int numberOfNights;


<<<<<<< HEAD
    public HotelReservation(String name, int numberOfNights){
=======
    public HotelReservation(String name, int numberOfNights) {
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
        this.name = name;
        this.numberOfNights = numberOfNights;
    }

<<<<<<< HEAD
    public double actualTotal(boolean requiresCleaning, boolean usedMinibar){
        double actualTotal = getEstimatedTotal();

        if(usedMinibar){
            actualTotal += 12.99;
        }
        if (requiresCleaning){
            actualTotal += 34.99;
        } if(usedMinibar && requiresCleaning){
            actualTotal += 34.99;
=======
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
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
        }
        return actualTotal;
    }

<<<<<<< HEAD
=======
    public double getEstimatedTotal() {
        return numberOfNights * 59.99;
    }

>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

<<<<<<< HEAD
    public double getEstimatedTotal() {
        return numberOfNights * 59.99;
    }

    public void setNumberOfNights(int numberOfNights){
=======
    public void setNumberOfNights(int numberOfNights) {
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
        this.numberOfNights = numberOfNights;
    }

    @Override
<<<<<<< HEAD
    public String toString(){
        return "RESERVATION - " + getName() + " - " + getEstimatedTotal();
    }

=======
    public String toString() {
        return "RESERVATION - " + this.name + " - " + getEstimatedTotal();
    }
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
}
