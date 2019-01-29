/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import apple.laf.JRSUIConstants;

public class JavaApplication61 {

    public static void main(String[] args) {

        // The 8 basic types: 6 for numbers, one for truth, one for humans.
        
        //4 ways to represent whole numbers
        byte ittyBitty = 0;
        short s = 10;
        int x = 10;    
        long l = 123012401212412l; //ends with an L
        
        //2 ways to represent decimal numbers
        float f = 10.0f;
        double d = 10.0;
        
        //1 way to represent truth
        boolean b = true; //false
        
        //1 way to represent...printed words (when grouped together)
        char c = 'c';
        
        //You can also declare multiples of the same type in one line.
        int w, y, z;
        
        //Be careful about naming, because names don't really matter to the
        // computer, only value does. The names are for OUR benefit.
        // So name your variables wisely, unlike this...
        int twelve = 13;
        int thirteen = 12;
        
        // Basic Operators
        y = x; // Assignment
        x = x / 2; // Division
        y = x * 2; // Multiplication 
        x = x + 1; // Addition
        x = y - 1; // Subtraction
        w = y % x; // Modulus (Remainder)
        x++;       // Increment (adds one to the variable)
        y--;       // Decrement (subtracts one from the variable)
        ++x;       // *Almost* the same as regular increment
        --y;       // *Almost* the same as regular decrement
        
        
        
        // Relational Operations
        boolean areEqual = twelve == thirteen; // Equality
        boolean notEqual = twelve != thirteen; // Un-Equality
        boolean greater = twelve > thirteen;   // Greater Than
        boolean lesser = twelve < thirteen;    // Less Than
        boolean gte = thirteen >= twelve;      // Greater or Equal
        boolean lte = thirteen <= twelve;      // Less or Equal
        
        // Logical Operators
        boolean anded = true && false;         // Only true if both true
        boolean ored = true || false;          // True if either side true
        boolean notted = !true;                // Reverses truth
        
        // Assignment Operators
        x = 12;                 //Assigns value to the left hand side (LHS)
        x += 12; // (x = x + 12) Adds LHS to RHS and sets value
        x -= 12; // (x = x - 12) Subtracts LHS from RHS and sets value
        x *= 12; // (x = x * 12) Multiplies ...
        x /= 12; // (x = x / 12) Divides ...
        x %= 12; // (x = x % 12) Modulates ...
        
        //You can print out 'Strings' and variables by adding + signs within 
        // the println statement, like this...
        int temp = 30 / 7;
        int remainder = 30 % 7;
        System.out.println("30 divided by 7: " + temp);
        System.out.println("Remainder is: " + remainder);

        //Notice there's a big difference between printing the VALUE of x and
        // just printing the 'String' or 'Character' x.
        System.out.println(x);
        System.out.println("x");
        System.out.println('x');
        
        
        //You can name your variables howevery ou want, just remember that YOU
        // have to be able to understand the code, and what each variable is
        // supposed to represent...
        // Read the 'Naming' section of the following page if you want to know more:
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
        
        int myUncleWasMauledByABearOneTime = 10;
        int secondVariable1231 = 10;
        int totalGrades = 10;
        int averageMPH = 10;
        int height = 1;
        int width = 12;
    }
}
