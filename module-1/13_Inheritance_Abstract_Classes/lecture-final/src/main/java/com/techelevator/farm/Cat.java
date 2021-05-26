package com.techelevator.farm;

/*
The final keyword with a class creates a class
that cannot be extended as a superclass
 */
public final class Cat extends FarmAnimal {

    public Cat() {

        super("Cat", "meow");
    }

    /*
    getSound() cannot be Overridden because it is
    final in FarmAnimal
     */
//    @Override
//    public String getSound() {
//        return "MEOW!!!!";
//    }
}
