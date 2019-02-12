
package javaapplication77;

import java.util.Random;

public class MinMaxGrades {

    public static void main(String[] args) {
        //Step 1: Create an array with grades.
        int[] grades = makeGrades();
        
        //Step 2 and 3, and 4. Define and find min and max.
        int min = findMin(grades);
        int max = findMax(grades);
        
        //Just for fun, print out all the grades.
        printAll(grades);
        
        //Step 5, print it out
        printStuff(min, max);
    }
    
    public static int[] makeGrades() {
        Random random = new Random();
        int[] grades = new int[20];
        for (int i=0; i< 20; ++i) {
            grades[i] = random.nextInt(101);
        }
        return grades;
    }
    
    public static int findMin(int[] grades) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<grades.length; ++i) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
    
        public static int findMax(int[] grades) {
        int min = Integer.MIN_VALUE;
        for (int i=0; i<grades.length; ++i) {
            if (grades[i] > min) {
                min = grades[i];
            }
        }
        return min;
    }
        
    public static void printStuff(int min, int max) {
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
    }
    
    public static void printAll(int[] grades) {
        //Foreach loop. As in: For each grade in grades...
        for (int grade : grades) {
            System.out.print(grade + "  ");
        }
        System.out.println("");
    }
}
