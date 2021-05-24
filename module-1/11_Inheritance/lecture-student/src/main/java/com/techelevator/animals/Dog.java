package com.techelevator.animals;


/*
extends keyword defines this class's superclass
 */
public class Dog extends Animal {

    /*
    If the superclass has a constructor, then the subclass consructor
    must call it using super()
    */

    //Constructors from superclass are NEVER inherited
    //Animal constructor is not passed to Dog
    //All public methods from Animal are inherited

    // think of Super keyword like the this.keyword
    public Dog() {
        super("Dog"); // Calls the constructor of the subclass
    }


    /*
        CAN OVERRIDE FUNCTIONALITY INHERITED FROM
        THE SUPERCLASS IN THE SUBCLASS WITH THE SUBCLASSES OWN VERSION
        OF THAT FUNCTIONALITY

        In the override the subclass may call the original superclass
        version of the method using the super.method()
         */
    @Override
    public String makeSound(){
        //calls the original Animal makeSound() using the super keyword
        return super.makeSound() + "Bark";


    }


}
