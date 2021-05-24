package com.techelevator.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundsApp {

    public static void main(String[] args) {

        Animal animal = new Animal("name");

        Dog dog = new Dog();

        System.out.println( dog.getName() );
        System.out.println( dog.makeSound() );

        Cat cat = new Cat();

        System.out.println( cat.getName() );
        System.out.println( cat.makeSound() );

        Fido fido = new Fido();

        System.out.println( fido.getName() );
        System.out.println( fido.makeSound() );


         /*
         Upcasting (widening) is when a subclass is cast
         to a superclass. Once cast, it will only have access
         to the fuctionality available from the superclass
         Form of widening going from more specific to more broad.
         Could also be implicit widening Animal dogAsAnimal = dog;
         */
        Animal dogAsAnimal = (Animal) dog; //this is explictly widened
        System.out.println(dogAsAnimal.getName());
        System.out.println(dogAsAnimal.makeSound());

        /*
        Casting Cat as Object allows only access to the methods
        that are part of Object, however, the object in memory
        is still a Cat
         */
        Object catsAsObject = cat;
        Object stringAsObject = new String("test");


        /*
        Downcasting (narrowing) is casting from superclass to subclass.
        Must be EXPLICITLY cast using ()
         */
        Animal catThatWasAnObject = (Animal) catsAsObject;


        /*
        Since String cannot be the data type Animal this
        will cause a ClassCastException
         */
       // Animal thisIsNotAnAnimal = (Animal) stringAsObject;

        /*
            POLYMORPHISM WITH INHERITANCE
        */
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fido);

        System.out.println(" Polymorphic animal sounds ");

        for (Animal currentAnimal : animals){
            System.out.println(currentAnimal.makeSound() );
        }

        //Polymorphism without a loop
        Animal someAnimal = new Cat();
        System.out.println(someAnimal.makeSound());

    }

    public void isAnimalACat(Animal animal){
        // variable instanceof datatype = syntax
        // instanceof returns true if object being
        // referenced by the variable can be cast as the give data type
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
        }
    }


}
