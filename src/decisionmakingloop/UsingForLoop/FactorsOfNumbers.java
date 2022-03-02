
package decisionmakingloop.UsingForLoop;


public class FactorsOfNumbers {
    public static void main(String[] args) {
        int num = 60,num1 = -60;
        System.out.println("Factors of positive number: ");
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                System.out.print(" "+i);
            }
        }
        System.out.println("Factors of positive number: ");
        for (int i = num1; i <=Math.abs(num1); i++) {
            if (i==0) {
                continue;
            }
            else{
             if (num1%i==0) {
                System.out.print(" "+i);
            }
            }
        }
    }
}
