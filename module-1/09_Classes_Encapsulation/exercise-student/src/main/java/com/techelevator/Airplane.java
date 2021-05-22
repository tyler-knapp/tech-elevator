package com.techelevator;

public class Airplane {


    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;

    //Constructor
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    //Reserve Seat method
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        //returns true if there were enough seats to make the reservation
        //So how do we know?

        if (forFirstClass) {
            if( totalNumberOfSeats <= getAvailableFirstClassSeats() ){
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            }
        } else {
            if( totalNumberOfSeats <= getAvailableCoachSeats() ){
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }
        }
        return false;
    }

        //Code the getters and the derived values
    public String getPlaneNumber() {
        return this.planeNumber;
}

    public int getTotalFirstClassSeats() {
        return this.totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return this.bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats(){
        return this.totalFirstClassSeats -  this.bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return this.totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return this.bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return this.totalCoachSeats - this.bookedCoachSeats;
    }

    //Code the constructor with the correct parameters
                //Code the methods, be meticulous carefully read what they are asking

}
