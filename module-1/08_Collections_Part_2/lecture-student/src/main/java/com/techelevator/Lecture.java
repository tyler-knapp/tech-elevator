package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {


		System.out.println();		
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		/* DECLARE AND INSTANTIATE A SET */

		//HasSet is the most commonly used. it does not maintain order.
		//Set<Integer> setOfNumbers = new HashSet<Integer>();
		//LinkedHashSet maintains order of insertion
		//Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		//TreeSet does not allow null and maintains the natural order of the data type
		Set<Integer> setOfNumbers = new TreeSet<Integer>();
		
		/* ADD ITEMS TO THE SET */

		setOfNumbers.add(1);
		setOfNumbers.add(10);
		setOfNumbers.add(30);
		setOfNumbers.add(301);
		/* duplicates are ignored */
		setOfNumbers.add(301);
		setOfNumbers.add(301);
		setOfNumbers.add(42);
		setOfNumbers.add(5708);

		//The order is ambiguous and we don't care about it.
		//Hash Set has no order to it. It removes duplicates for us.

		/* LOOP OVER A SET */

		for( Integer i : setOfNumbers ){
			System.out.println(i);
		}

		/*USE CASE:  USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructorWorkLog = {"Rachelle", "John", "Matt", "Kevin", "Rachelle", "Steve", "John", "Rachelle" };

		Set<String> workLogSet = new TreeSet<String>();

		//Add it to the set to remove duplicates
		for(String instructors : instructorWorkLog){
			workLogSet.add(instructors);
		}

		//Just here to print out the results
		for (String instructor : workLogSet){
			System.out.println(instructor);
		}

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */

		Map<String , String> animalNoises = new HashMap<String, String>();

		/* ADDING ITEMS TO A MAP */
		animalNoises.put("Cow", "Moo");
		animalNoises.put("Chicken", "Cluck");
		animalNoises.put("Dog", "Bark");
		animalNoises.put("Cat", "Meow");
		animalNoises.put("Lion", "Roar");
		animalNoises.put("Duck", "Roar");

		/* UPDATING AN ITEM IN A MAP */
		//if put with an existing key then the existing value is replaced with the new value
		animalNoises.put("Duck", "Quack");

		/* RETRIEVING AN ITEM FROM A MAP */
		String chickenSound = animalNoises.get("Chicken");
		System.out.println(chickenSound);

		//If the key does not exist in the map then get() returns null
		String foxSound = animalNoises.get("fox");

		/* REMOVING AN ITEM FROM A MAP */
		String lionNoise = animalNoises.remove("Lion");
		
		// If the key does not exists, the null returned
		String removeFoxReturn = animalNoises.remove("fox");

		
		
		/* CHECK IF AN ITEM EXISTS */
		// containsKey(key) returns TRUE if the KEY exists in the Map
		boolean catExists = animalNoises.containsKey("Cat");
		boolean mooExistsAsKey = animalNoises.containsKey("Moo");

		// containsValue(value) returns TRUE if the VALUE exists in the Map
		boolean mooExists = animalNoises.containsValue("Moo");
		boolean catExistsAsValue = animalNoises.containsValue("Cat");

		System.out.println();

		/* LOOPING OVER A MAP */
		// Loop through a map by looping through the Keys
		// Then using the keys to get the value

		for( String animalName : animalNoises.keySet() ){
			//For each key can use it to get the value
			String animalNoise = animalNoises.get(animalName);
			System.out.println("The " + animalName + " says " + animalNoise);
		}

		// Loop through the map using the EntrySet
		for(Map.Entry<String, String> mapEntry : animalNoises.entrySet() ){
			System.out.println("The " + mapEntry.getKey() + " says " + mapEntry.getValue() );
		}
		System.out.println();
		
		/* THE MAP KEY AND VALUE DATA TYPES */
		// Key and Value do not need to be the same type, but both must be Reference Types
		Map<Integer, Double> accounts = new HashMap<Integer, Double>();
		accounts.put(12345, 100d);
		accounts.put(56789, 200d);
		
		// Transfer half of Map 12345's money to account 56789
		//This is a really important concept for Homework Exercises and the real world in general
		double halfOfAcct12345 = accounts.get(12345) / 2 ;
		accounts.put(12345, accounts.get(12345) - halfOfAcct12345);
		accounts.put(56789 , accounts.get(56789) + halfOfAcct12345);
		

		System.out.println();
		System.out.println("####################");
		System.out.println("      MAP ORDER     ");
		System.out.println("####################");
		System.out.println();
	
		/*
		 * The Order that a Map stores the keys is dependent on the Implementation class used.
		 * 
		 * HashMap - does not retain order
		 * LinkedHashMap - retains the order of insertion
		 * TreeMap - maintains Natural Order for the Data Type of the key
		 */
		
		System.out.println("The values where inserted in the following order: 2, 10, 25, 1");
		
		System.out.println();
		System.out.println("  HASHMAP");
		System.out.println("Does not retain any order.  Instead it uses it's own internal ordering");
		
		Map<Integer, String> hashMapNumbersToWords = new HashMap<Integer, String>();
		
		hashMapNumbersToWords.put(2,  "Two");
		hashMapNumbersToWords.put(10, "Ten");
		hashMapNumbersToWords.put(25, "Twenty-Five");
		hashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : hashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + hashMapNumbersToWords.get(number));
		}		
		
		
		System.out.println();
		System.out.println("  LINKED HASHMAP");
		System.out.println("Retains the Order of Insertion");

		Map<Integer, String> linkedHashMapNumbersToWords = new LinkedHashMap<Integer, String>();
		
		linkedHashMapNumbersToWords.put(2,  "Two");
		linkedHashMapNumbersToWords.put(10, "Ten");
		linkedHashMapNumbersToWords.put(25, "Twenty-Five");
		linkedHashMapNumbersToWords.put(1,  "One");
		
		for (Integer number : linkedHashMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + linkedHashMapNumbersToWords.get(number));
		}	
		
		
		System.out.println();
		System.out.println("  TREEMAP");
		System.out.println("Maintains the Natural Order of the Data Type");
		System.out.println();
		System.out.println("Natural Order when numbers are Integer");
		
		Map<Integer, String> treeMapNumbersToWords = new TreeMap<Integer, String>();
		
		treeMapNumbersToWords.put(2,  "Two");
		treeMapNumbersToWords.put(10, "Ten");
		treeMapNumbersToWords.put(25, "Twenty-Five");
		treeMapNumbersToWords.put(1,  "One");
		
		for (Integer number : treeMapNumbersToWords.keySet()) {
			System.out.println(number + " is " + treeMapNumbersToWords.get(number));
		}	

		System.out.println();
		System.out.println("TreeMap Natural Order when numbers are String");

		Map<String, String> treeMapNumbersAsStrings = new TreeMap<String, String>();
		
		treeMapNumbersAsStrings.put("2",  "Two");
		treeMapNumbersAsStrings.put("10", "Ten");
		treeMapNumbersAsStrings.put("25", "Twenty-Five");
		treeMapNumbersAsStrings.put("1",  "One");
		
		for (String number : treeMapNumbersAsStrings.keySet()) {
			System.out.println(number + " is " + treeMapNumbersAsStrings.get(number));
		}
	}
}
