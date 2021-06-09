package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			total += res.getEstimatedTotal();
		}

		System.out.println(total);
	}

}
