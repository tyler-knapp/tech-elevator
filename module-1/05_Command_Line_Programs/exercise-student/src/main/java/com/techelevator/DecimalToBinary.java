package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		//Get user input

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		//Convert String to an array?

		String userDecimalInput = input.nextLine();

		String[] userDecimalStringArray = userDecimalInput.split(" ");

		int[] decimalIntegerArray = new int[userDecimalStringArray.length];

		for(int i = 0 ; i < userDecimalStringArray.length ; i++){
			decimalIntegerArray[i] = Integer.parseInt(userDecimalStringArray[i]);
		}


	}

}
