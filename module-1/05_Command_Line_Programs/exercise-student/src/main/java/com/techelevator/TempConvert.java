package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter the Temperature: ");
		String userTemperatureInputInDegrees = input.nextLine();

		double temperatureInDegrees = Double.parseDouble(userTemperatureInputInDegrees);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?: ");
		String userCelsiusOrFahrenheitInput = input.nextLine();

		double temperatureToCelsius =  (temperatureInDegrees - 32) / 1.8;
		double temperatureToFahrenheit =  (temperatureInDegrees * 1.8) + 32;

		if(userCelsiusOrFahrenheitInput.equals("C")){
			System.out.println( temperatureInDegrees + "C is " + temperatureToFahrenheit + "F" );
		} else if (userCelsiusOrFahrenheitInput.equals("F")){
			System.out.println( temperatureInDegrees + "F is " + temperatureToCelsius + "C" );
		} else {
			System.out.println("error... maybe you need to capitalize!");
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
