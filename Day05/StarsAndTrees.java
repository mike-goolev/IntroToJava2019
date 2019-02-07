package javaapplication72;

public class StarsAndTrees {

    public static void main(String[] args) {

        //Drawing a tree.
        for (int rowNum = 0; rowNum < 10; rowNum +=2) {
            //Draw spaces before I draw stars for the row.
            for (int colNum = 0; colNum < 4-rowNum/2; colNum++) {
                System.out.print(" ");
            }
            //Draw the stars for the row
            for (int colNum = 0; colNum <= rowNum; colNum++) {
                System.out.print("*");
            }
            
            //Go to the next row
            System.out.println("");
        }
        System.out.println("    *"); //Drawing the trunk

        //Adding some space with newline characters!
        System.out.println("\n\n");
        
        //1 star to 10 stars
        for (int rowNum=0; rowNum<10; ++rowNum) {
            for (int colNum=0; colNum<=rowNum; ++colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //9 stars to 1 star
        for (int rowNum = 0; rowNum < 9; ++rowNum) {
            for (int colNum = 9 - rowNum; colNum > 0; --colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        //2 stars to 10 stars
        for (int rowNum = 1; rowNum < 10; ++rowNum) {
            for (int colNum = 0; colNum <= rowNum; ++colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //9 stars to 1
        for (int rowNum = 0; rowNum < 9; ++rowNum) {
            for (int colNum = 9 - rowNum; colNum > 0; --colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
