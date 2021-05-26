package com.techelevator;

public class TriangleWall extends Wall{

    private int base;
    private int height;

    public TriangleWall(String name, String color, int base, int height){
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public TriangleWall(String name, String color) {
        super(name, color);
    }

    public String toString(){
        return getName() + " (" + getBase() + "x" + getHeight() + ") triangle" ;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return (base * height) / 2;
    }
}
