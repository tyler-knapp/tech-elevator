package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the Temperature: ");
		String userTemperatureInput = input.nextLine();
		double numberOfTemperature = Double.parseDouble(userTemperatureInput);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?: ");
		String userCelsiusOrFahrenheit = input.nextLine();

		double temperatureToCelsius =  (numberOfTemperature - 32) / 1.8;
		double temperatureToFahrenheit =  (numberOfTemperature * 1.8) + 32;

		if(userCelsiusOrFahrenheit.equals("C")){
			System.out.println( numberOfTemperature + "C is " + temperatureToFahrenheit + "F" );
		} else if (userCelsiusOrFahrenheit.equals("F")){
			System.out.println( numberOfTemperature + "F is " + temperatureToCelsius + "C" );
		} else {
			System.out.println("error");
		}

		/*
		Step 1. get User input
		Step 2. Calculate something
		Step 3. Give feedback to the user -- Display the Output
		 */

		/*
		1. Create a scanner for System in
		2. Ask the user the temperature
		3. Get the user input pf the temperature
		4. Convert the temperature to a numeric type
		5. Ask the user if the temperature they entered is in C or F?
		6. If the user answers C convert the temperature to F
		7. If the user answers F then convert the temp to C
		8. Display the original temp and the converted temp
		 */

	}

}
