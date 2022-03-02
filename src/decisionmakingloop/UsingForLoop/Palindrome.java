
package decisionmakingloop.UsingForLoop;


public class Palindrome {
    // Java Program to Check Palindrome
    
    public static void main(String[] args) {
        
    int num = 1221,revNum = num,rem,rev=0;
        for (; revNum>0;) {
            rem = revNum%10;
            rev = rev*10+rem;
            revNum/=10;
        }
        System.out.println(rev);
        
        if (num==rev) {
            System.out.println("It's a palindrome number: "+rev);
        }
        else System.out.println("Number is not palindrome: "+rev);
       
    }
}
