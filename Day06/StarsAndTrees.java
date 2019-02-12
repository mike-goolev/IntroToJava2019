package javaapplication72;

public class StarsAndTrees {

    public static void main(String[] args) {

        drawTree();
        drawTree();
        
        drawTriangle(1, 10);
        drawTriangle(2, 5);
        drawTriangle(1, 15);
        
        //You can still call Up and Down, but easier to just do Triangle
        // (which just calls Up and Down. It's all about convenience)
        drawUp(2,10);
        drawDown(9, 1);
    }
    
    public static void drawTriangle(int start, int end) {
        drawUp(start, end);
        drawDown(end-1, start);
    }

    public static void drawTree() {
        //Drawing a tree.
        for (int rowNum = 0; rowNum < 10; rowNum += 2) {
            //Draw spaces before I draw stars for the row.
            for (int colNum = 0; colNum < 4 - rowNum / 2; colNum++) {
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
        System.out.println("");
    }

    public static void drawUp(int start, int end) {
        //start star to end stars
        for (int rowNum = start - 1; rowNum < end; ++rowNum) {
            for (int colNum = 0; colNum <= rowNum; ++colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    /**
     * A method that draws stars from length start to length end.
     * @param start how many stars to start with
     * @param end how many stars to end with
     */
    public static void drawDown(int start, int end) {
        //start stars to end star
        for (int rowNum = start; rowNum >= end; --rowNum) {
            for (int colNum = 0; colNum < rowNum; ++colNum) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
