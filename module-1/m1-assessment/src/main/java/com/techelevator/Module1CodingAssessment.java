package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HotelReservation hotel = new HotelReservation("Ritz", 4);

		String path = "C:\\Users\\Student\\source\\repos\\tylerknapp-java-blue\\module-1\\m1-assessment\\data-files\\HotelInput.csv";
		File file = new File(path);

		try(FileReader read = new FileReader(file)){

		} catch (FileNotFoundException e){
			System.out.println("File was not found");
		}
	}

}
