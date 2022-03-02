package decisionmakingloop.UsingForLoop;


public class ReverseNumber {
    public static void main(String[] args) {
        
    int num = 1234,rev=0,rem;
        for (int i = 1; i <= num; i++) {
            rem = num%10;
            rev = rev * 10 +rem;
            num/=10;
        }
        System.out.println(rev);
    }
 
}
