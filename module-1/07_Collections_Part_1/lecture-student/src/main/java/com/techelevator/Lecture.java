package com.techelevator;

import java.util.*;

/*
	Standard to use domain name to name the package
	Fully qualified name of this class: com.techelevator.Lecture
	A fully qualified name is one that contain the package. Classname to uniquely identify it.
 */

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// Creating a variable to access our list
		List<String> instructors = new ArrayList<String>();

		instructors.add("John");
		instructors.add("Steve");
		instructors.add("Matt");
		instructors.add("Kevin");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for( int i = 0; i< instructors.size(); i++){
			System.out.println(instructors.get(i) ); // same as instructors[i]
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		instructors.add("John");

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		instructors.add(3, "Rachelle");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove(5);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean isSteveInList = instructors.contains("Steve"); // case sensitive

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfRachelle = instructors .indexOf("Rachelle");

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		//Convert List to an Array (built in syntax)

		String [] instructorsAsArray = instructors.toArray( new String[instructors.size()] );


		List<String> instructorsAsListAgain = Arrays.asList( instructorsAsArray );

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(instructors);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


		//very common case to print all the values, but for special actions like return every other, or return the last two
		// we will need a traditional for loop
		// mostly used for arraylists and arrays... can be used with all collections except one
		for( String name : instructors){
			System.out.println(name);
		}

		/*
		for (int i = 0 ; i < 1 instructors.size(); i++){
			String name = instructors.get(i);
			System.out.println(name);
		}
		 */

		double[] numbers = { 1.2, 3, 7, 92.3};

		for(double num : numbers){
			System.out.println(num * 2);
		}

		System.out.println("####################");
		System.out.println("       Primiitive WRAPPER");
		System.out.println("####################");
		System.out.println();

		List<Integer> numberList = new ArrayList<Integer>();

		numberList.add( 10 );
		numberList.add( 12 );
		numberList.add( 1 );
		numberList.add( new Integer(16) );

		Integer employees = new Integer( 25);
		Integer piecesOfCake = new Integer("24");

		if(employees > piecesOfCake){
			System.out.println("Not enough cake");
		}

		Integer objX = 10;
		int intY = 20;
		intY = objX + 5;
		objX = intY + 10;

		System.out.println("####################");
		System.out.println("       QUEUE");
		System.out.println("####################");
		System.out.println();

		Queue<String> tasks = new LinkedList<String>();

		// Add items using offer()
		tasks.offer("Clean Dishes");
		tasks.offer("Sweep Floor");
		tasks.offer("Clean Counters");
		tasks.offer("Scrub ceiling");

		/*
		The while loop continues while the condition is true, and ends when it becomes false... self iterates
		 */

		while ( !tasks.isEmpty() ) { // works like a for loop, but only uses the boolean condition. Will interate until false
			String nextTask	= tasks.poll();
			System.out.println(nextTask);
		}

		System.out.println("####################");
		System.out.println("       Stack");
		System.out.println("####################");
		System.out.println();

		Stack<Integer> numberStack = new Stack<Integer>();
		numberStack.push(10);
		numberStack.push(20);
		numberStack.push(40);
		numberStack.push(50);

		while( !numberStack.isEmpty() ){
			Integer nextNumber = numberStack.pop();
			System.out.println(nextNumber);
		}

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8};
		Stack<Integer> numsAsStack = new Stack<Integer>();
		for( int n : num ){
			numsAsStack.push(n);
		}
		while( !numberStack.isEmpty() ){
			System.out.println(numberStack.pop());
		}

	}
}
