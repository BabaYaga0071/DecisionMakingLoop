
package decisionmakingloop.UsingForLoop;


public class primeOrNot {
    public static void main(String[] args) {
        // Java Program to Check Whether a Number is Prime or Not
        
        int num = 5;
        boolean flag = false;
        
        for (int i = 2; i <= num/2; i++) {
            if (num%i==0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("num is prime");
        }
        else   System.out.println("num is not prime");
    }
}
