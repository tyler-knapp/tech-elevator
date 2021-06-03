package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the destination file?");
		String destinationFilePath = input.nextLine();

		File destFile = new File(destinationFilePath);

		String output;
		try (PrintWriter dataOutput = new PrintWriter(destFile)) {
			for( int i = 1; i <= 300; i++){
				if(i % 15 == 0 ){
					output = "FizzBuzz";
				} else if ( i % 3 == 0 || Integer.toString(i).contains("3")){
					output = "Fizz";
				} else if (i % 5 ==0 || Integer.toString(i).contains("5")){
					output ="Buzz";
				} else {
					output = Integer.toString(i);
				}
				dataOutput.println(output);
			}
		}

	}
}
