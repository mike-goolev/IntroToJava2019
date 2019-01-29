/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalc;

/**
 *
 * @author Schroeder <schroeder.austincc.edu>
 */
public class GradeCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("I'm going to do some grade calculations");
        
        //1. Declare variables 
        int grade1 = 97;
        int grade2 = 78;
        double grade3 = 50.4;
        int grade4 = 90; // 'A'; 
        int grade5 = 90;

        double total;
        double average;
        
        //2. Do stuff with them
        total = grade1;
        total += grade2;
        total += grade3;
        total += grade4;
        total += grade5;
        average = total / 5;
        
        //3. Print out results
        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);
    }
    
}
