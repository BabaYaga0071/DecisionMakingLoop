/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchPractice;

/**
 *
 * @author imuha
 */
public class simpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        int num1=10,num2=5,sum;
        char operator = '.';
        switch(operator){
            case '+': sum = num1+num2;
                System.out.println("Addition is: "+sum);break;
            case '-': sum = num1-num2;
                System.out.println("subtraction is: "+sum);break;
            case '*': sum = num1*num2;
                System.out.println("multiplication is: "+sum);break;
            case '/': sum = num1/num2;
                System.out.println("subtraction is: "+sum);break;
            default: System.out.println("operator error! ");
        }
    }
}
