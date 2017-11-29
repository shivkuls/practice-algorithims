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
public class FibTwo {
    

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nth element input
        System.out.print("Enter the last element of Fibonacci sequence: ");
        int n = sc.nextInt();

        //Print out iteration method
        System.out.println("Fibonacci iter "+ fibIteration(n));

        //Print out recursive method
        System.out.println("Fibonacci recur "+ fibRecursion(n));
        
    }

    //Iteration method
    static int fibIteration(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = n; i > 0; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive method
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}