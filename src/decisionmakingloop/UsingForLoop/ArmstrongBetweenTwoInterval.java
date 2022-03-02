package decisionmakingloop.UsingForLoop;


public class ArmstrongBetweenTwoInterval {
    public static void main(String[] args) {
        // Java Program to Display Armstrong Number Between Two Intervals
        
        int fNum = 999 , lNum = 99999;
        for (int i = fNum; i <= lNum; ++i) {
            
            
            int  armNumber,exponent=0,result = 0,rem;
            armNumber = i;
            
            for (;armNumber!=0;armNumber/=10,exponent++);
            armNumber = i;
            for (;armNumber!=0;) {
                rem = armNumber%10;
                
                result += Math.pow(rem, exponent);
                armNumber/=10;
            }
            if (result == i) {
            System.out.println(" "+i);
        }
        
        }
    }
   
}
