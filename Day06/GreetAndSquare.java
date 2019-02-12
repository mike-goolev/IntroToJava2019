/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

import java.util.Scanner;

public class GreetAndSquare {

    public static void main(String[] args) {
        greet("Bob");
        greet("Bobbie");
        greet("Robert");
        greet("Rob");
        
        System.out.println(squared(3));
        double x = squared(64);
        System.out.println(x);
        
        superGreet();
        Scanner scanner = new Scanner(System.in);
        greet(scanner);
        double aSum = aSum();
    }
    
    public static double aSum() {
        return 2.0;
    }
    
    public static double squared(double x) {
        return x*x;
    }
    
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    public static void superGreet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
    
    public static void greet(Scanner scanner) {
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
    
}
