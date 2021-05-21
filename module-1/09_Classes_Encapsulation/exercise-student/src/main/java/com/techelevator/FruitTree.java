package com.techelevator;

public class FruitTree {

    //Instance Variables
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    //Constructor
    public FruitTree(String typeOfFruit , int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    //Method
    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }
        return false;
    }

    //Getters and Setters at end of file
    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
}
