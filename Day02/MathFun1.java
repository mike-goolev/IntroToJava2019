/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfun1;

/**
 *
 * @author Schroeder <schroeder.austincc.edu>
 */
public class MathFun1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int aNumber = 13;
        int original = aNumber;

        aNumber += 4; //aNumber = aNumber +4;
        aNumber *= 4;
        aNumber -= 8;
        aNumber /= 4;
        aNumber -= original;

        System.out.println(aNumber);
    }

}
