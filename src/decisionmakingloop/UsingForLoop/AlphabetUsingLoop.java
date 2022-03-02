
package decisionmakingloop.UsingForLoop;

import java.util.Scanner;


public class AlphabetUsingLoop {
    public static void main(String[] args) {
        // Java Program to Display Alphabets (A to Z) using loop
     Scanner input = new Scanner(System.in);
     boolean start = false;

        
         while(!start){
             
             
        System.out.println("Capital alphabet: ");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.print(" "+ch);
        }
             System.out.println("\nSmall alphabet: ");    
        for (char ch = 'a'; ch <= 'z'; ch++) {
        System.out.print(" "+ch);
        }
        System.out.println(" \nDo you like to re run the program: ");
        String s = input.nextLine();
             if (s.equals("yes")) {
                 start = false;
             }
             if (s.equals("no")) {
                 start = true;
             }
     }
    }
  
}
