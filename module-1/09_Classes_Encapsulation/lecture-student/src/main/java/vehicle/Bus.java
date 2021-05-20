package vehicle;

public class Bus {

    /*
    Final creates a variable that can be assigned once and only once
    static creates a variable that is shared among all objects created from this class
    final static together form what most other programming languages call a constant
     */

    private final static int TOTAL_SEATS = 40; //naming convention when final and static together

    /*
    Member Variables to hold the state. Should always be private.
    Also sometimes called Instance Variables
     */

    //not meant to be run, meant to be used as a data class

    private String routeName;
    private int passengers;
    private int gallonsOfGas = 50; // sets the starting balue to 50 when the object is created
    private boolean isDoorOpen = false; // sets the starting value to false when the object is created

        /*
        Constructor
         */
        /*
            No-argument constructor is provided by Java implicitly as long as it is the only constant
            in the class
            If there is a constructor overload the the no-argument constructor must
            be explicitly included, otherwise included if we want the class to be able to instantiated without passing arguments
            for example: Bus bus = new Bus()
         */

    public Bus(){

    }

    public Bus(String routeName){
        this.routeName = cleanUpRouteName(routeName);
    }

    /*
    Methods - provide behavior for the class
     */

    public boolean board() {
        if( this.isDoorOpen && getRemainingSeats() >= 1 ){
            this.passengers += 1;
            return true;
        }
        return false;
    }
    /*
    Method Overload is a method with the same name and different arguments
    - either different data types or diff number
        Overloads should provide the same functionality for diff conditions
     */
    public boolean board(int peopleBoarding){
        if( this.isDoorOpen && getRemainingSeats() >= 1 ){
            this.passengers += 1;
            return true;
        }
        return false;
    }

    /*
    Private methods provides reusable code that is only available in this class
     */

    private String cleanUpRouteName(String routeName){
        String name = routeName.replaceAll(" ", "-");
        return name.toUpperCase();
    }

    /*
    Static method is shared by all the instances of a class and should neber
    relate to a single instance. The should be functional, meaning that given the
    same input they always the same output and nothing is changed. They are used
    using the class name (String.valueOf()) instead of an object
     */

    public static int getDistanceRemaining(int gallonsOfGasRemaining, int mpg){
        return  gallonsOfGasRemaining * mpg;
    }

    public int getRemainingSeats() {
        return TOTAL_SEATS - this.passengers;
    }

    /*
    Can also SET values using simple method that encapsulate the functionality in a
    way that is easier to use and understand
     */

    public void openDoor() {
        this.isDoorOpen = true;
    }
    public void closedDoor() {
        this.isDoorOpen = false;
    }
    public void addGas(int gallonsToAdd){
        this.gallonsOfGas += gallonsToAdd;
    }

    /*
    Getters and setters - provide public access to private member variables
     */
    //  GETTER
    public String getRouteName(){
        return this.routeName;
    }
    //  SETTER
    public void setRouteName(String routeName) {
        this.routeName = cleanUpRouteName(routeName);
    }

    public int getGallonsOfGas(){
        return this.gallonsOfGas;
    }

    public boolean isDoorOpen(){
        return this.isDoorOpen;
    }

    /*
    Overridding a method provides this classes unique functionality for a method that was
    inherited. To override a method, the method signature must match exactly and the
    @Override annotation added about it.
     */

    @Override
    public String toString(){
        //  Can return anu string that represents out object as a String
        //  Either with the raw value, or formatted
        //  the way we want it presented

        return "Bus{ routeName=" + this.routeName +
                " passengers=" + this.passengers +
                " gallonsOfGas=" + this. gallonsOfGas +
                " isDoorOpen=" + this.isDoorOpen + "]";

       // return "The bus running on the " + routeName + " route";
    }

    @Override
    public  boolean equals(Object other){
        if (this == other){
            return true;
        }
        Bus otherBus = (Bus) other;
        if (this.routeName.equals(otherBus.getRouteName()) &&
            this.gallonsOfGas == otherBus.getGallonsOfGas() &&
            this.getRemainingSeats() == otherBus.getRemainingSeats()){
            return true;
        }
        return false;
    }




}
