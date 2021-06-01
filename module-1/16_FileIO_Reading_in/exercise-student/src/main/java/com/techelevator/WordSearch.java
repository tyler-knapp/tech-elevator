package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {


		// Step 1: Path to file
		Scanner input = new Scanner(System.in);

		System.out.println("What is the fully qualified name of the file that should be searched?");
		String pathToFile = input.nextLine();

		System.out.println("What is the search word you are looking for?");
		String searchWord = input.nextLine();

		System.out.println("Should the search be case sensitive? (Y/N) ");
		String caseSensitive = input.nextLine();

		//C:\\Users\\Student\\source\\repos\\tylerknapp-java-blue\\module-1\\16_FileIO_Reading_in\\exercise-student\\alices_adventures_in_wonderland.txt

		// Step 2: Create a file object
		File file = new File(pathToFile);

		if(!file.exists()) {
			System.out.println("File does not exist");
		}
		if(!file.isFile()) {
			System.out.println("This is not a file");
		}

		int lineNumber = 1;
		// Step 3: Create a Scanner and pass it the File object
		try(Scanner fileScanner = new Scanner(file)){
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				Pattern pattern;
				if( caseSensitive.equalsIgnoreCase("Y")){
					pattern = Pattern.compile(searchWord);
				} else {
					pattern = Pattern.compile(searchWord, Pattern.CASE_INSENSITIVE);
				}
				Matcher matcher = pattern.matcher(line);
				if(matcher.find()){
					System.out.println(lineNumber + ") " + line );
				}
				lineNumber += 1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (NullPointerException e){
			System.out.println( "Please enter a valid word" );
		}
	}
}
