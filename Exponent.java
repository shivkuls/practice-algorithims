/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;
import java.util.*;
/**
 *
 * @author Shiv
 */
public class Exponent {
    public static void main(String[] args) {
        System.out.println("Enter Number ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int ans = 1;
        System.out.println("Enter Exponent ");
        int e = sc.nextInt();
        for(int i = 0; i<e;i++){
            ans *=f;
        }
        System.out.println("answer "+ ans);
    }
}
