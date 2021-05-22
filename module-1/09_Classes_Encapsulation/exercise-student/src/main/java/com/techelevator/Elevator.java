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
        if(!isDoorOpen()){
            doorOpen = !isDoorOpen();
        }
    }

    public void closeDoor(){
        if(isDoorOpen()){
            doorOpen = !isDoorOpen();
        }
    }

    public void goUp( int desiredFloor){
        if(!doorOpen) {
            if( desiredFloor > getCurrentFloor() && desiredFloor <= numberOfFloors){
                currentFloor += desiredFloor - getCurrentFloor();
            }
        }
    }
    public void goDown( int desiredFloor){
        if(!doorOpen){
            if( desiredFloor < currentFloor  && desiredFloor <= numberOfFloors && desiredFloor > 0){
                currentFloor -= getCurrentFloor() - desiredFloor;
            }
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
