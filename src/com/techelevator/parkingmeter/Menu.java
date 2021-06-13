package com.techelevator.parkingmeter;

import java.util.Scanner;

public class Menu {

    private static final Scanner in = new Scanner(System.in);

    public void showWelcomeMessage() {
            System.out.println("*************************");
            System.out.println("**      WELCOME TO      **");
            System.out.println("**      SMARTPARK       **");
            System.out.println("*************************");
            System.out.println("RATE PER HOUR: $0.75");
            System.out.println("MAX STAY: 3 HOURS");
    }

    public String getChoiceFromMenuOne(){
        String choice = null;
        while( choice == null){
            System.out.println("(1) ADD TIME");
            System.out.println("(2) QUIT ");

            choice = in.nextLine();

            if ( choice.equals("1") ||
                    choice.equals("2")  ){
                break;
            } else {
                System.out.println("Invalid selection!");
                choice = null;
            }
        }
        return choice;
    }

    public String getChoiceFromOrderMenu(){
            String choice = null;
            while(choice == null){
                System.out.println("(A) 20 Minutes = $0.25");
                System.out.println("(B) 8 Minutes = $0.10");
                System.out.println("(C) 4 minutes = $0.05");

                choice = in.nextLine();

                if ( choice.equalsIgnoreCase("A") ||
                        choice.equalsIgnoreCase("B") ||
                            choice.equalsIgnoreCase("C")){
                    break;
                } else {
                    System.out.println("Invalid selection!");
                    choice = null;
                }
            }
        return choice;
            }

    public int addTimeMessage(Timer timer){
        int timeToAdd = 0;
        timeToAdd = Integer.parseInt(in.nextLine());
        return timer.getTimeBalance();
    }


    public void showGoodbye(){
        System.out.println("*************************");
        System.out.println("Thank you for your time:)");
        System.out.println("Remember to PARK SMART!");
        System.out.println("Goodbye!");
        System.out.println("*************************");
    }

}
