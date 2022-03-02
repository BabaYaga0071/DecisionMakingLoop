
package decisionmakingloop.UsingForLoop;


public class GCDNumber {
    public static void main(String[] args) {
        int num1 = 60,num2 = 24,gcd=0;
        for (int i = 1; i <=num1 && i<=num2; i++) {
            if (num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
        System.out.printf("gcd of %d and %d is:%d\n ",num1,num2,gcd);
        int lcm = (num1*num2)/gcd;
        System.out.println("LCM is: "+lcm);
        
        
    }
}
