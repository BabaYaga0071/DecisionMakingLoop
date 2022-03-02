
package decisionmakingloop.UsingForLoop;


public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153,armNumber,exponent=0,rem,result=0;
        armNumber = num;
        for (;armNumber!=0;armNumber/=10,exponent++);
        
        armNumber = num;
        
        for (;armNumber!=0;) {
            rem = armNumber%10;
            armNumber/=10;
            result += Math.pow(rem, exponent);
        }
        System.out.println(result);
        if (result==num) System.out.println("It's an armstrong number: "+result);
        else System.out.println("It's not an armstrong number: "+result);
    }
}
