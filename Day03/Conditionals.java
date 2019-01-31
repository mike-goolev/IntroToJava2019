package conditionals;

public class Conditionals {

    public static void main(String[] args) {
        int userId = 1337;
        int pin = 12345;

        if (userId == 1337) {
            if (pin != 12345) {
                System.out.println("Pin is wrong!");
            } 
            else {
                System.out.println("Access Granted!");
            }
        }
        else {
            System.out.println("User ID is wrong!!");
        }
    }
}
