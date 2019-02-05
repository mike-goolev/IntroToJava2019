/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import java.util.Random;
import java.util.Scanner;

public class GradesWithArrays {

    public static void main(String[] args) {
        
        //Useful variables
        int numGrades = 5;
        
        //Internal variables
        String name;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[100]; //Grades is an array of up to 100 integers.
        int sum = 0;
        int average = 0;
        
        //Get the name from user.
        System.out.println("Enter the student's name: ");
        name = scanner.nextLine(); 
        
        //Get all the grades from the user
        for(int i=0;i<numGrades; i++) {
            System.out.println("Enter grade " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }

        //Add them up and average them.
        for (int i=0;i<numGrades; i++) {
            sum+=grades[i];
        }
        average = sum / numGrades;
        
        //Print results
        System.out.println("Student name: " + name);
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + average);
        
        //Print colorful commentary.
        if (average < 60) {
            System.out.println("You straight-up failed, yo.");
        }
        else if (average < 70) {
            System.out.println("You got a D. Sorry man.");
        }
        else if (average < 80) {
            System.out.println("You got a C. Not bad.");
        }
        else if (average < 90) {
            System.out.println("You got a B! Congrats!");
        }
        else if (average == 100) {
            System.out.println("I smell a nerd.");
        }
        else if (average > 100) {
            System.out.println("Cheater, cheater...");
        }
        else {
            System.out.println("You got an A!!! Wooo!!!!");
        }
    }
    
}

        //Initializing your array values, with random numbers...
//        for(int i=0;i<numGrades; i++) {
//            grades[i] = random.nextInt(51) + 50; //Random integer between 0 and 100.
//        }
        
        //A random number between 1 and 6, because nextInt starts at 0.
//        int dieRoll = random.nextInt(6) + 1;
        

        //Manually set grades.
//        grades[0] = 100;
//        grades[1] = 70;
//        grades[2] = 90;
//        grades[3] = 65;
//        grades[4] = 80;