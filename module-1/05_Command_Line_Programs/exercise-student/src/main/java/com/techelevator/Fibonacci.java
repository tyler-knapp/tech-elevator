package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// Get user input
		Scanner input = new Scanner(System.in);

		System.out.print( " Please enter a number: " );
		int userFibNumber = input.nextInt();
		input.nextLine();

		int fibPositionZero = 0;
		int fibPositionOne = 1;
		int fibSumPreviousTwoInts;
		
		if(userFibNumber == 0) {
			System.out.println("0, 1");
		} else if(userFibNumber == 1) {
			System.out.println("0, 1, 1");
		} else {
			for(int i = 0; i <= fibPositionOne ; i++){
				if( fibPositionZero <= userFibNumber) {
					if(userFibNumber > 1){
						System.out.print( fibPositionZero + " , ");
					}
				}
				fibSumPreviousTwoInts = fibPositionZero + fibPositionOne;
				fibPositionZero = fibPositionOne;
				fibPositionOne = fibSumPreviousTwoInts;
			}
		}



	}

}
