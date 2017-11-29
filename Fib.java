/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;

/**
 *
 * @author Shiv
 */
public class Fib {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < 15; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        System.out.println(x); 
    }
}
