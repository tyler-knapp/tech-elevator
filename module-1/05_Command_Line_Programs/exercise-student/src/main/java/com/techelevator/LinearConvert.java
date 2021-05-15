package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		//m = f * 0.3048  foot to meter conversion
		//f = m * 3.2808399 meter to foot conversion

		//Create Scanner
		Scanner input = new Scanner(System.in);

		// Get User Input

		System.out.println("Please enter the length: ");
		double userLength = input.nextDouble();
		input.nextLine();

		System.out.println("Is the measurement in (m)eter, or (f)eet?: ");
		String inMetersOrFeet = input.nextLine();

		// if it's m calculate to feet
		if( inMetersOrFeet.equals("m")){
		// print calculation to user
			System.out.println( userLength + "m is " + (userLength * 3.2808399) + "f" );
		// if it's f calculate to meters
		} else if( inMetersOrFeet.equals("f")){
		//print calculation to user
			System.out.println( userLength + "f is " + (userLength * 0.30489) + "m");
		// give an error to the user if something is not working
		} else{
			System.out.println("error... Check spelling and capitalization?");
		}

	}

}
