package javaapplication78;

public class FunctionFun {

    public static void main(String[] args) {
        foo();
        
        hello("Bob");
        hello("Susan");
        
        doStuff(1, 2.0, "Thing");
        
        int x = add(3, 2); //Calls the *INT* version of add
        System.out.println(x);
        
        double d = add(2.7, 1.1); //Calls the *DOUBLE* version of add
        System.out.println(d);
        
        String s = concat("Hello ", "World");
        System.out.println(s);
        
        System.out.println(justFalse());
        
        boolean areEqual = areEqual(3, 3);
        System.out.println(areEqual);
    }
    
    //A function that takes no arguments and returns nothing.
    public static void foo() {
        System.out.println("Foo!");
    }
    
    //A function that takes a string, and prints it out, returning nothing.
    public static void hello(String s) {
        System.out.println("Hello, " + s);
    }
    
    //A function that takes an int, a double, and a String, printing them out.
    public static void doStuff(int x, double d, String s) {
        System.out.println(s + " " + x + " " + d);
    }
    
    //A function that takes two ints and returns the sum.
    public static int add(int x, int y) {
        return x + y;
    }
    
    //A function that takes two double and returns the sum.
    public static double add(double x, double y) {
        return x + y;
    }
    
    //A function that takes two strings and concatenates them.
    public static String concat(String s1, String s2) {
        return s1 + s2;
    }
    
    //A fuction that always returns false
    public static boolean justFalse() {
        return false;
    }
    
    //A function that returns true if the two numbers given are equal
    public static boolean areEqual(int x, int y) {
        return x == y;
    }
}
