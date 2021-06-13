package com.techelevator.parkingmeter;

import java.awt.*;

public class parkingmeter {

    private static final String CHOICE_ADD_TIME = "1";
    private static final String CHOICE_QUIT = "2";

    private Menu menu;
    private Timer timer;

    public parkingmeter(Menu menu) {
        this.menu = menu;
    }

    public void run(){

        menu.showWelcomeMessage();

        while(true) {
            String choice = menu.getChoiceFromMenuOne();
            if(choice.equalsIgnoreCase(CHOICE_QUIT)){
                break;
            } else if(choice.equalsIgnoreCase(CHOICE_ADD_TIME)){
                menu.getChoiceFromOrderMenu();
                //display an option menu with the coins and their quantities. Get user input from this.
            }
        }
        menu.showGoodbye();
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        parkingmeter cli = new parkingmeter(menu);
        cli.run();
    }

}
