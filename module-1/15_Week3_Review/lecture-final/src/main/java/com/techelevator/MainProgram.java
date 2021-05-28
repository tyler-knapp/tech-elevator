package com.techelevator;

import com.techelevator.view.Menu;

public class MainProgram {

    private static final String CHOICE_QUIT = "Q";
    private static final String CHOICE_SHOW_ITEMS = "S";

    private Menu menu;

    public MainProgram(Menu menu) {
        this.menu = menu;
    }

    public void run() {

        menu.showWelcome();

        while(true) {
            String choice = menu.getChoiceFromMainMenu();

            if (choice.equalsIgnoreCase(CHOICE_QUIT)) {
                break;
            } else if (choice.equalsIgnoreCase(CHOICE_SHOW_ITEMS)) {
                showItemsMenu();
            }

        }

        menu.showGoodbye();
    }

    private void showItemsMenu() {

        while(true) {
            String choice = menu.getChoiceFromItems();

            if (choice.equalsIgnoreCase("A")) {
                addItemToCart();
                System.out.println();
            } else if (choice.equalsIgnoreCase("B")){
                break;
            }
        }
    }

    private void addItemToCart() {

    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        MainProgram main = new MainProgram(menu);
        main.run();
    }


}
