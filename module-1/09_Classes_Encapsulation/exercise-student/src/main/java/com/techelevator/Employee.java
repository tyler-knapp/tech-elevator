package com.techelevator;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    //full name is derived from firstname + lastname... do we make an instance variable?
    // derived is never a member(instance) variable
    private String department;
    private double annualSalary;

    //no argument constructor explicitly stated because we need to
    //overload it with a constructor that takes arguments
    public Employee(){

    }
    //Constructor to overload our no-argument constructor above
    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }
    //Method
    public void raiseSalary(double percent){

    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public  String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    //MAY NEED TO CLEANUP LAST NAME TO ALL CAPS?
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
