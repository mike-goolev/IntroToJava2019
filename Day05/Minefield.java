
package javaapplication73;

import java.util.Random;

public class Minefield {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        int size = 10;
        
        //To make a 2D array, we need an array of arrays...
        char[][] rows = new char[size][];
        
        //And then for each row of that array, we need to make an array.
        for(int i=0; i<size; i++) {
            rows[i] = new char[size];
        }
        
        //Now, we put stuff in that array. In this case, we can have either a
        // space, or a mine. Right now, thanks to the random bool, it's 50/50.
//        char letter = 'A'; //Stuff for letters instead of mines.
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                boolean mine = random.nextBoolean();
                if (mine) {
                    rows[i][j] = '*';
                }
                else {
                    rows[i][j] = ' ';
                }
                //Put a letter...which we're not doing now that we're doing mines
//                rows[i][j] = letter;
//                letter++;
            }
        }
        
        //Printing out the field.
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(rows[i][j]);
            }
            System.out.println("");
        }
    }
    
}
