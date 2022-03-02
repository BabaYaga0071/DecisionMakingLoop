
package decisionmakingloop.UsingForLoop;


public class powerOfNumber {
    public static void main(String[] args) {
        
        // Java Program to Calculate the Power of a Number
        
        int base = 10,exponent = 3, result = 1;
        
        for (int i = 1; i <=exponent; exponent--) { // the loop is decrementing the exponent value
            result = result * base;
        }
        System.out.println("power of 10 is: "+result);        
    }
    
}
