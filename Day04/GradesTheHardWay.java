/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author Schroeder <schroeder.austincc.edu>
 */
public class GradesTheHardWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Useful variables
        int grade1 = 0;
        int grade2 = 50;
        int grade3 = 60;
        int grade4 = 58;
        int grade5 = 80;
        
        //Intermediate variables
        int sum = 0;
        int average = 0;
        
        sum += grade1;
        sum += grade2;
        sum += grade3;
        sum += grade4;
        sum += grade5;
        average = sum / 5;
        
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + average);
        
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
