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
//    public Employee(){
//
//    }
    //Constructor to overload our no-argument constructor above
    public Employee(int employeeId, String firstName, String lastName, double salary){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }
    //Method
    public void raiseSalary(double percent){
        if( percent != 0){
            annualSalary = annualSalary * ( 1.0 + (percent /100));
        }
    }
    //percentage given as a double but we need to convert it to decimal ex.) 5.5% = 0.055
    // add one to it to get the increase salary not just the amount of the increase

    public int getEmployeeId() {
        return employeeId;
    }

    public  String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return lastName + ", "+ firstName;
    }

    public String getDepartment(){
        return department;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    //MAY NEED TO CLEANUP LAST NAME TO ALL CAPS?
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }



}
