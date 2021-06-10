package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
<<<<<<< HEAD
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
=======
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		HotelReservation reservation = new HotelReservation("Ritz", 2);
		System.out.println( reservation.getEstimatedTotal() );
		System.out.println( reservation.getName() );
		System.out.println( reservation.getNumberOfNights() );
		System.out.println(reservation.actualTotal(true, true));
		System.out.println(reservation);

		String path = "C:\\Users\\Student\\source\\repos\\tylerknapp-java-blue\\module-1\\m1-assessment\\data-files\\HotelInput.csv";
		File file = new File(path);


		List<HotelReservation> reservations = new ArrayList<HotelReservation>();

		try(Scanner fileScanner = new Scanner(file)){

			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				String[] parts = line.split(",");
				int nights = Integer.parseInt(parts[1].trim());
				reservations.add(new HotelReservation(parts[0], nights));
			}

		} catch (FileNotFoundException e){
			System.out.println("File was not found");
		}
		double total = 0;
		for (HotelReservation res : reservations){
=======
		HotelReservation reservation = new HotelReservation("John", 2);
		System.out.println( reservation.getEstimatedTotal() );
		System.out.println( reservation.getName() );
		System.out.println( reservation.getNumberOfNights() );
		System.out.println( reservation.calculateActualTotal( true, true));
		System.out.println( reservation );

		File file = new File("C:\\Users\\Student\\source\\repos\\java-blue-main\\module-1\\m1-assessment\\data-files\\HotelInput.csv");

		List<HotelReservation> reservations = new ArrayList<HotelReservation>();
		try (Scanner fileScanner = new Scanner(file)) {

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] parts = line.split(",");
				int nights = Integer.parseInt(parts[1].trim());
				reservations.add( new HotelReservation(parts[0], nights));
			}


		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		double total = 0;
		for (HotelReservation res : reservations) {
>>>>>>> d67e944b224033ddf0e52888c441f30bf18d7c13
			total += res.getEstimatedTotal();
		}

		System.out.println(total);
	}

}
