
package decisionmakingloop.UsingForLoop;


public class FibonacciSeries {
    public static void main(String[] args) {
        // Java Program to Display Fibonacci Series
        int num = 10,Fnum = 0,Snum = 1,Nnum = 0;
        
        for (int i = 1; i <=num; i++) {
            System.out.printf(Fnum+" + ");
            
            Nnum = Fnum+Snum;
            Fnum = Snum;
            Snum = Nnum;
        }
        System.out.print(": "+Nnum);
    }
}
