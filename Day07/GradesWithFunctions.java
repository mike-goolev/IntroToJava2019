package javaapplication80;

import java.util.Scanner;

public class GradesWithFunctions {
    
    public static void main(String[] args) {

        //Useful variables
        int numGrades = 5;

        //Internal variables
        String name;
        Scanner scanner = new Scanner(System.in);
        int[] grades; //Grades is an array of up to 100 integers.
        int sum;
        double average;

        //Get the name from user.
        name = getName(scanner);

        //Get all the grades from the user
        grades = getGrades(scanner, numGrades);

        //Add them up and average them.
        sum = sumGrades(grades);
        average = sum / (double)numGrades;

        //Print results
        printGrades(name, sum, average);
        printCommentary(average);
    }
    
    public static String getName(Scanner scanner) {
        System.out.println("Enter the student's name: ");
        return scanner.nextLine();
    }
    
    public static int[] getGrades(Scanner scanner, int numGrades) {
        int[] grades = new int[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        return grades;
    }
    
    public static int sumGrades(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum;
    }
    
    public static void printGrades(String name, int sum, double average) {
        System.out.println("Student name: " + name);
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + average);
    }
    
    public static void printCommentary(double average) {
        if (average < 60) {
            System.out.println("You straight-up failed, yo.");
        } else if (average < 70) {
            System.out.println("You got a D. Sorry man.");
        } else if (average < 80) {
            System.out.println("You got a C. Not bad.");
        } else if (average < 90) {
            System.out.println("You got a B! Congrats!");
        } else if (average == 100) {
            System.out.println("I smell a nerd.");
        } else if (average > 100) {
            System.out.println("Cheater, cheater...");
        } else {
            System.out.println("You got an A!!! Wooo!!!!");
        }
    }
}
