package com.techelevator;

import javax.sound.midi.Soundbank;

public class LoopsAndArrays {

    public static void main(String[] args) {

        String[] instructors = new String[5];

        instructors[0] = "John";

        instructors[1] = "Rachelle";

        instructors[3] = "Matt";

        instructors[4] = "Kevin";

        instructors[2] = "Steve";

        System.out.println( instructors [1] );

        String greeting = "Hello " + instructors[2];

        System.out.println(greeting);

        System.out.println( instructors.length );

        instructors[0] = "The John Fulton";


        // This wil cause an ArrayOutOfBoundsException
        //instructors[5] = "BeetleJuice";

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int definedInMain;

        if (numbers[3] > 5){
            //definedINMain is available here
            int definedInIf;

            if (numbers [4] > 5) {
                // definedINIf is available here
                // definedInMain is available here
                int definedInNestedIf;
            }
            // definedInNestedIf is NOT available here
        }

        boolean[] letsGo = new boolean[4];

        /* LOOPS

         */


        /* variable to change ; boolean condition ; change the variable

         */

        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println(i);
        }


        int sum = 0;
        for ( int i = 100 ; i <= 200; i++ ){
            if ( i % 2 ==0 ){
                sum += i;
            }
        }
        System.out.println("Sum of 100 to 200 = " + sum);


        for (int x = 75 ; x >= 50 ; x--){
            System.out.println(x + " ");
        }

        int i =0;
        for ( ; i < 100 ; i +=2 ){
            System.out.println(i);
        }

        /*
        break keyword
         */
        for ( int f = 0; f < 10; f++ ){
            if (f == 5) {
                break;
            }
            System.out.println(f);
        }

        //looping through an array

        for ( int j = 0; j < instructors.length; j ++ ) {
            System.out.println( instructors[j] );
        }

        for ( int p = 0 ; p < numbers.length; p++){
            if (p % 2== 0){ // use p to access the index
                System.out.println( numbers[p]); // use array[p] to access the value
            }
        }

        //Loop and Double every number in an array of integers

        for ( int h = 0; h < numbers.length ; h++ ) {
            numbers[h] *= 2;
        }



        for ( int h = 0; h < numbers.length / 2; h++ ){
            System.out.println(numbers[h]);
        }

        //print all numbers, except 10 and the number immediately following it

        for ( int t = 0; t < numbers.length ;t++) {
            if( numbers[t] == 10){
                t++;
                continue;
            }
            System.out.println( numbers[t] + " ");
        }

    }
}
