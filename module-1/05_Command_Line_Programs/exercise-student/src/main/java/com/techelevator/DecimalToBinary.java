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

		//System.out.println(decimalIntegerArray[2]);

		//Iterate through the array
		for (int i = 0 ; i < decimalIntegerArray.length ; i++){

			//iterate the
			for( int inner = 0 ; decimalIntegerArray[i] / 2 <= 1 ; inner++){

				if( decimalIntegerArray[inner] % 2 == 0){
					System.out.println("0");
					decimalIntegerArray[inner] /=2;
				}
				System.out.println("1");
				decimalIntegerArray[inner] /= 2;
			}
					}

				}
		}
		//for( int i = decimalIntegerArray.length - 1  ; i > 0 ; i--){

		//	if( decimalIntegerArray[i] % 2 == 1 ){
		//		System.out.println("1");
		//	}
		//	System.out.println("0");
		//}


// 	while (input.hasNextInt()) {


//while (userIntegerToConvert >= 1 {
	//calculate and print next digit (left to right)
//int currentBinaryDIgit = userIntegertoConvert 5 2;

