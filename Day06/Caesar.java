
package javaapplication71;

public class Caesar {

    public static void main(String[] args) {
        
        //Part of one our code: Declarations and initializations
        char[] alphabet = getAlphabet();
        char[] message = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        int secretNumber = 3;
        
        //Part two: Printing out the alphabet and encrypted alphabet
        encryptAndPrint(alphabet, secretNumber);
        
        System.out.println(""); //Spacer, just for fun.
        
        //Part three: Printing out the message and encrypted message
        encryptAndPrint(message, secretNumber);
    }
    
    public static void encryptAndPrint(char[] message, int offset) {
        //Printing out our original and encrypted message.
        System.out.print("Original message:  ");
        printStuff(message);
        
        //Encrypt the message
        message = encrypt(message, offset);
        
        System.out.print("Encrypted message: ");
        printStuff(message);
        
        //Part Four: Decrypting the message again
        //Decrypt the message by cheating & sending the opposite of secretNumber
        message = encrypt(message, -offset);
        
        System.out.print("Decrypted message: ");
        printStuff(message);
    }
    
    public static char[] getAlphabet() {
        char[] alphabet = new char[26];
        //Initialize our alphabet array, 'a' starts at 97, btw.
        for (int i=97; i<alphabet.length+97; ++i) {
            alphabet[i-97] = (char)i;
        }
        return alphabet;
    }
    
    public static void printStuff(char[] stuff) {
        //Printing the message
        for (int i=0; i<stuff.length; ++i) {
            System.out.print(stuff[i]);
        }
        System.out.println("");
    }
    
    public static char[] encrypt(char[] stuff, int offset) {
        //Encrypt the message
        for (int i=0; i<stuff.length; ++i) {
            stuff[i] += offset;
        }
        
        return stuff;
    }
}
