package com.techelevator;

public class Television {


    //instance variables
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume= 2;


    //constructor not needed. All instance variables assigned a default.

    //methods

    public void turnOff(){
        if(isOn){
            isOn = false;
        }
    }

    public void turnOn(){
        if(!isOn){
            isOn = true;
            currentChannel = 3;
            currentVolume = 2;
        }
    }

    public void changeChannel(int newChannel){
        if(isOn){
            if( newChannel > 3 && newChannel< 18){
                currentChannel = newChannel;
            }
        }
    }

    public void channelUp(){
        if(isOn){
            currentChannel += 1;
            if(currentChannel > 18){
                currentChannel =3;
            }
        }
    }

    public void channelDown(){
        if(isOn){
            currentChannel -= 1;
            if(currentChannel < 3){
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if(isOn && currentVolume <=10){
            currentVolume += 1;
        }
    }

    public void lowerVolume() {
        if(isOn && currentVolume > 0){
            currentVolume -= 1;
        }
    }

    //Getters
    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
