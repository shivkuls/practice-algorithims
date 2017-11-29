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
public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter number: " );
        Scanner sc = new Scanner(System.in);
        long  x = sc.nextInt();
        for(long i = x-1;i>0;i--){
            x = x *i;
        }
        System.out.println(x);
    }
}
