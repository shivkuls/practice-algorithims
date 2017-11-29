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
public class ReverseSB {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        StringBuffer brac = new StringBuffer(sc.nextLine());
        StringBuffer brac2 = brac.reverse();
        System.out.println(brac2);
        
    }
}
    

