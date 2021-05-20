package vehicle;

public class BusDriver {

    public static void main(String[] args) {

        Bus busOne = new Bus();
        busOne.setRouteName("third to fifth");

        System.out.println( busOne.getRouteName() );

        System.out.println(busOne.getRemainingSeats());
        busOne.openDoor();
        busOne.board();
        busOne.closedDoor();
        System.out.println(busOne.getRemainingSeats());

        busOne.openDoor();
        busOne.board(10);
        busOne.closedDoor();

        Bus busTwo = new Bus("High to Third");

        System.out.println("--------------------------");
        System.out.println( busOne );

        boolean areEqual = busOne.equals(busTwo);
        System.out.println(areEqual);

        Bus busThree = new Bus("abc");
        Bus busFour = new Bus("abc");

        areEqual = busThree.equals(busFour);
        System.out.println(areEqual);

        //CallingThe static method
        System.out.println(Bus.getDistanceRemaining( 20, 10));



    }


}
