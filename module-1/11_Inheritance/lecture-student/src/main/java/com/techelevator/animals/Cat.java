package com.techelevator.animals;

public class Cat extends Animal{

    public Cat() {
        super("Cat");
    }


    //Allows us to deviate from inherited methods
    @Override
    public String makeSound(){
        return "MEOW!";
    }

}
