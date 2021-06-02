package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String path = "C:\\Users\\Student\\source\\repos\\tylerknapp-java-blue\\module-1\\17_FileIO_Writing_out\\exercise-student-optional\\src\\test\\resources\\bacon.txt";

        System.out.println("What is the search word?");
        String searchWord = input.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = input.nextLine();

        System.out.println("What is the source file?");
        String pathToSourceFile = input.nextLine();

        System.out.println("What is the destination file?");
        String destinationFilePath = input.nextLine();

        //C:\Users\Student\source\repos\tylerknapp-java-blue\module-1\17_FileIO_Writing_out\exercise-student-optional\src\test\resources\bacon.txt

        File file = new File( pathToSourceFile );

        if(!file.exists()) {
            System.out.println("File does not exist");
        }
        if(!file.isFile()) {
            System.out.println("This is not a file");
        }






    }

}
