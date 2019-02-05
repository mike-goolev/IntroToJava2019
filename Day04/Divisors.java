/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67;

/**
 *
 * @author Schroeder <schroeder.austincc.edu>
 */
public class Divisors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //A clean place to set aside all of our "useful" variables.
        int maxCount = 10;
        int maxDivisor = 10;
        
        //The not so useful variables
        int intermediateVariable = 2;
        
        //Nested Looping (Nested Logic)
        //For each number, I'm going to print out whether it's divisble by 1, 2, 3, 4, or 5.
        for (int count = 1; count <= maxCount; count++) {
            System.out.println("The number is: " + count);

            for (int i = 1; i <= maxDivisor; i++) {
                if (count % i == 0) {
                    System.out.println("Divisible by " + i);
                }
            }
        }

        //A weird way to do it, if you want.
//        int numTimes = 10;
//        int count = 0;
//        do {
//            System.out.println(numTimes-count);
//            count += 2;
//        } while(count <= numTimes);
//        int count = 1000000;
//        do {
//            if(count % 2 == 0) {
//                System.out.println(count);
//            }
//            count--;
//        } while(count >= 0);
    }

}
