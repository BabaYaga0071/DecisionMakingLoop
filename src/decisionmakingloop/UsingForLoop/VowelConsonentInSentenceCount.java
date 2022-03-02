/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionmakingloop.UsingForLoop;

/**
 *
 * @author imuha
 */
public class VowelConsonentInSentenceCount {
    public static void main(String[] args) {
      String sen = " I love my country very much & more than my life";
      int vowel = 0,consonent = 0,digit = 0,space = 0,others = 0;
      String lower = sen.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                ++vowel;
            }
            else if(ch>='a' && ch<='z'){
            ++consonent;
            }
            else if (ch>='0' && ch<='9') {
                ++digit;
            }
            else if (ch==' ') {
                ++space;
            }
            else ++others;
        }
        System.out.println("vowel: "+vowel);
        System.out.println("consonent: "+consonent);
        System.out.println("digit: "+digit);
        System.out.println("space: "+space);
        System.out.println("others: "+others);
    }
 
}
