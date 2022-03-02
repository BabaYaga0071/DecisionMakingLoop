
package decisionmakingloop.UsingForLoop;

import java.util.Scanner;


public class FactorialNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       boolean start = false;
       while(!start){
        int fact = 0,sum=1;
        for (int i = 1; i <=fact; i++) {
            sum = sum * i;
        }
        System.out.println("factorial: "+sum);
       
        
        
        // program re run conditions
           System.out.println("Do you like to re-run the program(yes / no):");
           String s = input.nextLine();
           if (s.equals("no")||s.equals("NO")) {
               start = true;
           }
      }
   }
}
