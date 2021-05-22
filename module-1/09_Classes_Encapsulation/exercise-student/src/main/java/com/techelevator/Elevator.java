package com.techelevator;

public class Elevator {

    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
    }

    //must be closed to open.
    public void openDoor(){
        if(isDoorOpen()){
            doorOpen = isDoorOpen();
        }
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public boolean isDoorOpen() {
        return this.doorOpen;
    }
}
