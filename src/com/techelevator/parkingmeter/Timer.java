package com.techelevator.parkingmeter;

import java.sql.Time;

public class Timer {

    private static final double NICKLE = 0.05;
    private static final double DIME = 0.10;
    private static final double QUARTER = 0.25;

    private static final int TWENTY_MINUTES = 20;
    private static final int EIGHT_MINUTES = 8;
    private static final int FOUR_MINUTES = 4;

    private int timeBalance = 0;

    public int getTimeBalance() {
        return timeBalance;
    }

    public Timer(){
    }

    public int addTime(String userInput){
        int timeOutput = 0;

//            if(userInput.equalsIgnoreCase("A")){
//                balance += 20;
//            } else if (userInput.equalsIgnoreCase("B")){
//                timeOutput += 8;
//            } else if (userInput.equalsIgnoreCase("C")){
//                timeOutput += 4;
//            }
        return timeOutput;
    }

}
