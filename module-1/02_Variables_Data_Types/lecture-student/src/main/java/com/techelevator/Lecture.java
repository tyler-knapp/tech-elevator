package com.techelevator;

import java.util.Spliterators;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises;

 		numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "TechElevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";

		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		float pi = 3.1216f;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String firstName = "Tyler";
		System.out.println(firstName);

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOfMouseButtons = 3;
		System.out.println(numberOfMouseButtons);

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		byte percentageOfBattery;
		percentageOfBattery = 8;
		System.out.println(percentageOfBattery);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int difference = 121 - 27;
		System.out.println(difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		float addition = 12.3f + 32.1f;
		System.out.println(addition);

		/*
		12. Create a String that holds your full name.
		*/

		String fullName = "Tyler Knapp";
		System.out.println(fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String hello = "Hello, ";
		System.out.println( hello + fullName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		String concatenatedFullName = fullName + " Esquire";
		System.out.println(concatenatedFullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";
		System.out.println(fullName);

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		 String saw = "Saw";
		 saw += 2;
		 System.out.println(saw);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		int zero = 0;
		saw += zero;
		System.out.println(saw);

		/* Widening */
		int one = 10;
		long two = one;


		/* Narrowing */
		long three = 10;
		int four = (int) three;


		/*
		18. What is 4.4 divided by 2.2?
		*/
		double divisionProblem = 4.4/2.2;
		System.out.println(divisionProblem);


		/*
		19. What is 5.4 divided by 2?
		*/
		double dividedByTwo = 5.4 / 2;
		System.out.println(dividedByTwo);
		/*
		20. What is 5 divided by 2?
		*/
		double result = 5 / 2;
		System.out.println(result);



		/*
		21. What is 5.0 divided by 2?
		*/
		result = 5.0 / 2;
		System.out.println(result);


		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		 double divisionProblemNew = 66.6 / 100;
		 System.out.println(divisionProblemNew);




		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		int remainder = 5 % 2;
		System.out.println(remainder);

		remainder = 19 % 10;
		System.out.println(remainder);

		/*
		24. What is 1,000,000,000 * 3?
		*/

		long largerNumber = 1000000000l * 3;
		System.out.println(largerNumber);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean isDoneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/
		isDoneWithExercises = true;
		System.out.println(isDoneWithExercises);
		
	}

}
