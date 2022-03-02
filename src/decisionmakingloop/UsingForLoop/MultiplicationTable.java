
package decisionmakingloop.UsingForLoop;


public class MultiplicationTable {
    public static void main(String[] args) {
        
        int mult = 5;
        for (int row = 1; row <= 10; row++) {
            System.out.printf("%d * %d = %d\n",mult,row,(mult*row));
        }
    }
 
}
