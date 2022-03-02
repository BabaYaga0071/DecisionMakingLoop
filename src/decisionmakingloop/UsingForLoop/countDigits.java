/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionmakingloop.UsingForLoop;


public class countDigits {
    public static void main(String[] args) {
        int num = 456789589 ,count=0;
        
        /*
        for (int i = 1; i <= num; i++) {
            num /=10;
            count++;
        }
        */
        for (;num!=0;) {
            num/=10;
            ++count;
        }
       int x = count;
        System.out.println("total numbers: "+x);
      
        
    }
    
}
