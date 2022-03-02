
package decisionmakingloop.UsingForLoop;

public class primeBetweenTwoIntervals {
    public static void main(String[] args) {
        // Java Program to Display Prime Numbers Between Two Intervals
        
        int num1=10,num2=20,flag=0;
        
        for (int i = num1; i <= num2; i++) { //first interval(num1) will iterate until num2;
            flag = 1; // here flag is defining that i is prime or not. if i is prime then the condition become true and then i become prime;
            for (int j = 2; j < i/2; j++) { 
                /*
                here j =  2 and i /2 means; if the number is not prime then it will be divided with 2 and i / 2 means
                if i = 10; then i / 2 = 5 so the number will be divided with it's half.
                */
                if (i%j==0) { // if i completely divided with j then it's not a prime number;
                    flag = 0; // so the flag become false
                    break;    // though flag is false so the break statement break the loop
                }
            }
            if (flag!=0) {  // if flag is true then it's may not divided so it's a prime number
                System.out.print(" "+i);
            }
        }
    }
}
