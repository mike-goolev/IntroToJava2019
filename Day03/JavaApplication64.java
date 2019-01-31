package javaapplication64;

import java.util.Scanner; //1. Import scanner

public class JavaApplication64 {

    public static void main(String[] args) {

        int numRows = 6;
        for (int j = 0; j < numRows; ++j) {
            for (int i = numRows - j; i > 0; --i) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Cheating...
//        System.out.println("*****");
//        System.out.println("****");
//        System.out.println("***");
//        System.out.println("**");
//        System.out.println("*");


        Scanner scanner = new Scanner(System.in);   // Make a scanner
        int favoriteNumber, secondFavorite;
        int myFavorite = 13;

        System.out.println("What's your favorite number?");
        favoriteNumber = scanner.nextInt(); //Use the scanner
        scanner.nextLine(); //Eat the whitespace.
        if (favoriteNumber == myFavorite) {
            System.out.println("OMG!! Me too!");
        } 
        else if (favoriteNumber == 12) {
            System.out.println("That's cool.");
        }
        else {
            System.out.println(favoriteNumber + ", interesting...");
        }

        //Second favorite number
        System.out.println("Well, what's your second favorite?");
        secondFavorite = scanner.nextInt();
        scanner.nextLine();
        if (favoriteNumber == secondFavorite) {
            System.out.println("What?! That's the same number!");
        }
        else if (secondFavorite == myFavorite) {
            System.out.println("OMG, me too!");
        }
        else {
            System.out.println(secondFavorite + " is stupid.");
        }
        
        //Sum of two numbers
        System.out.println("I feel like adding. Give me two numbers, NOW!");
        int num1 = scanner.nextInt();
        scanner.nextLine(); //Eat whitespace 
        int num2 = scanner.nextInt();
        scanner.nextLine(); //eat Whitespace 
        int sum = num1 + num2;
        System.out.println("Your sum is..." + sum);
        
        //How many pets do you have?
        System.out.println("How many pets do you have?");
        int numPets = scanner.nextInt();
        scanner.nextLine(); //Eat that whitespace.
        if (numPets == 0) {
            System.out.println("That is so sad...");
        }
        else if (numPets > 10) {
            System.out.println("Holy shit!");
        }
        else {
            System.out.println("Ok, that's cool.");
        }
        
        System.out.println("What's your name, by the way?");
        String name = scanner.nextLine();
        System.out.println(name + ", that's pretty.");
        
//        Scanner scanner = new Scanner(System.in); //2. Make a scanner
//        
//        System.out.println("Hello, what's your name?");
//        String name = scanner.nextLine(); //3. Use the scanner, to get stuff.
//        System.out.println("And how old are you?");
//        int age = scanner.nextInt();
//        scanner.nextLine(); //Eating the newline. Do this when NOT grabbing lines.
//        System.out.println("And what's your best friend's name?");
//        String friend = scanner.nextLine();
//        System.out.println("Hello, " + name);
//        System.out.println("You're " + age + ", really?!");
//        System.out.println("Your friend is: " + friend);
//        int month = 2;
//        int userId = 1337;
//        int pin = 1234;
//
//        switch (month) {
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            default:
//                System.out.println("Etc...");
//                break;
//        }
//
//        if (userId == 1337) {
//            if (pin != 12345) {
//                System.out.println("Pin is wrong!");
//                if (true) {
//                    System.out.println("True!");
//                    if (true) {
//                        System.out.println("True still!");
//                        if (false) {
//                            System.out.println("NEVER!!!");
//                        } else {
//                            System.out.println("Else!!");
//                        }
//                    }
//                }
//            } else {
//                System.out.println("Access Granted!");
//            }
//        } else {
//            System.out.println("User ID is wrong!!");
//        }
//        int x = 12;
//        int y = 4;
//        int userId = 12345;
//        String username = "sarah";
//        String password =" 12345";
//        
//        if (username == "steven" && password == "12345") {
//            System.out.println("X is divisible by 3!");
//            if (y % 2 == 0) {
//                System.out.println("Y is even, too!");
//            }
//        }
//        else {
//            
//        }
//        else if (x % 3 == 0) {
//            System.out.println("I will never happen");
//        }
//        else {
//            System.out.println("The remainder is 2!");
//        }
    }

}
