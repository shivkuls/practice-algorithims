/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;
import java.util.Scanner;
/**
 *
 * @author Shiv
 */
public class Palindrome {
    public static void main(String[] args) {
       int count = 0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
       char[]y = str.toCharArray();
       for(int i = 0 ;i <y.length;i++){
           if(y[i] == y[y.length-i-1])
               count++;
            }
       if(count == y.length)
            System.out.println("True");
       else
            System.out.println("false");
}
        
    }

