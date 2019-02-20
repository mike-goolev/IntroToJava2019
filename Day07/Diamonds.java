package diamonds;

import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numRows : ");
        int numRows = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char symbol = sc.next().charAt(0);

        //For each row, up to numRows
        for (int row = 1; row <= numRows; row++) {
            //Draw the whitespace
            for (int j = 1; j <= numRows - row; j++) {
                System.out.print(" ");
            }
            //Draw the symbol
            for (int j = 1; j <= row * 2 - 1; j++) {
                System.out.print(symbol);
            }
            //Carriage return (enter/return/newline/etc)
            System.out.println();
        }
        //Starting at one less (since the longest one has already been drawn)
        //Gonna print the tapering end of the diamond.
        for (int i = numRows - 1; i > 0; i--) {
            //Draw the whitespace
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            //Draw the symbol
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(symbol);
            }
            //Carriage return (enter/return/newline/etc)
            System.out.println();
        }
    }
}
