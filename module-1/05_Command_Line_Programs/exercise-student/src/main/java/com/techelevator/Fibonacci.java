package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );

		System.out.println("Please Enter a Number: ");

		int userFibInput = input.nextInt();

		int firstFibNumber = 0;
		int secondFibNumber = 1;
		int sumOfPreviousTwoNumbers = firstFibNumber + secondFibNumber;

		if(userFibInput <= 0){
			System.out.print( firstFibNumber + ", " + secondFibNumber );
		} else if ( userFibInput == 1){
			System.out.print( firstFibNumber + ", " + secondFibNumber + ", " + userFibInput );
		}
			System.out.print( firstFibNumber + ", " + secondFibNumber );
			for(int i = 0 ; i <= userFibInput; i = sumOfPreviousTwoNumbers ){

			System.out.print(", " + sumOfPreviousTwoNumbers);

			firstFibNumber = secondFibNumber;
			secondFibNumber = sumOfPreviousTwoNumbers;
			sumOfPreviousTwoNumbers = firstFibNumber + secondFibNumber;

		}


	}

}
