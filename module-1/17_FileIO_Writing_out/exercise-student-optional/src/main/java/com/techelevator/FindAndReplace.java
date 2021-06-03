package com.techelevator;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String path = "C:\\Users\\Student\\source\\repos\\tylerknapp-java-blue\\module-1\\17_FileIO_Writing_out\\exercise-student-optional\\src\\test\\resources\\bacon.txt";

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

        File destFile = new File(destinationFilePath);

        if(!file.exists()) {
            System.out.println("File does not exist");
        }
        if(!file.isFile()) {
            System.out.println("This is not a file");
        }

        if(!destFile.exists()){
            System.out.println("File does not exist");
        }

        if(!destFile.isFile()){
            System.out.println("This is not a file");
        }
        try(
                Scanner fileScanner = new Scanner( file ) ;
                PrintWriter dataOutput = new PrintWriter( destFile )
        ) {
            while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            dataOutput.println(line.replaceAll(searchWord, replacementWord));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
