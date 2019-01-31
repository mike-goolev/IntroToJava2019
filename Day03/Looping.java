package looping;

public class Looping {

    public static void main(String[] args) {
                System.out.println("Prepare to be hello-ed");
        
        int count = 0;
        //while loop. Might never run, depending on your initial test.
        while(count < 3) {
            System.out.println("Hola!");
            count++;
        }
        
        //Do while. Will always run AT LEAST ONCE.
        count = 0;
        do {
            System.out.println("Hi!!!");
            ++count;
        } while (count < 3);
        
        /*For loop. Inside the parentheses...
         * 1. Instantiate a test variable. 
         * 2. Test something. 
         * 3. Modify my test variable
         *Execute the block of code, until #2 is false.
         */
        for (int i = 0; i < 5; ++i) {
            System.out.println("Hello.");
        }
        //Another for loop. This one counts down instead of up!
        for (int i=5; i>0; --i) {
            System.out.println(".olleH");
        }
        System.out.println("Goodbye.");
    }
    
}
