package com.techelevator;

public class Employee {

    private final static double STARTING_SALARY = 60000;

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;


    public Employee(){

    }

    public Employee(long employeeId, String firstName, String lastName,
                        String email, Department department, String hireDate){
    }

    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public void raiseSalary(double percent){
        if( percent != 0){
            salary = salary * ( 1.0 + (percent /100));
        }
    }

    public static double getStartingSalary() {
        return STARTING_SALARY;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
