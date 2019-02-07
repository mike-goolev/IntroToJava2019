/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication71;

public class Caesar {

    public static void main(String[] args) {
        
        //Part of one our code: Declarations and initializations
        char[] alphabet = new char[26];
        char[] message = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        int secretNumber = 3;
        
        //Initialize our alphabet array, 'a' starts at 97, btw.
        for (int i=97; i<alphabet.length+97; ++i) {
            alphabet[i-97] = (char)i;
        }
        
        //Part two: Printing out the alphabet and encrypted alphabet
        System.out.println("Alphabet:");
        for (int i=0; i<alphabet.length; ++i) {
            System.out.print(alphabet[i]);
        }
        System.out.println("");
        
        //Actually encrypting the alphabet.
        for (int i=0; i<alphabet.length; ++i) {
            alphabet[i] += secretNumber;
        }
        
        System.out.println("Encrypted:");
        for (int i=0; i< alphabet.length; ++i) {
            System.out.print(alphabet[i]);
        }
        System.out.println("");
        System.out.println("");
        
        //Part Three: Printing out our original and encrypted message.

        //Original message
        for (int i=0; i<message.length; ++i) {
            System.out.print(message[i]);
        }
        System.out.println("");
        
        //Encrypt the message
        for (int i=0; i<message.length; ++i) {
            message[i] += secretNumber;
        }
        
        //Printing the encrypted message
        for (int i=0; i<message.length; ++i) {
            System.out.print(message[i]);
        }
        System.out.println("");
        
        //Part Four: Decrypting the message again
        
        //Decrypt the message
        for (int i=0; i<message.length; ++i) {
            message[i] -= secretNumber;
        }
        
        //Printing the encrypted message
        for (int i=0; i<message.length; ++i) {
            System.out.print(message[i]);
        }
        System.out.println("");
    }
    
}
