package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values
and displays each decimal value as itself and its binary equivalent
$ DecimalToBinary
Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		String decimalValuesInput = input.nextLine();

		String[] decimalValuesSeparated = decimalValuesInput.split(" ");
		// Loop through our array of strings
		for(int i = 0;  i < decimalValuesSeparated.length ; i++) {
			//for each iteration parse and give us an int at specified index (i)
			int inputNumber = Integer.parseInt(decimalValuesSeparated[i]);
			// print out each user generated number & text
			System.out.print(inputNumber + " in binary is ");
			//pass input number to decimalToBinary
			decimalToBinary(inputNumber);
			System.out.println(" ");
		}
	}
	public static void decimalToBinary(int inputNumber){

		int[] binaryNumber = new int[100];
		int i = 0;

		while (inputNumber > 0){

			binaryNumber[i++] = inputNumber % 2 ;
			inputNumber /=  2;
		}
		for(int j = i-1;j >= 0;j--){
			System.out.print(binaryNumber[j]);

		}
	}
}