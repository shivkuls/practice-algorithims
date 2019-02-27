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
public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        String result1 = "";
        String userInput = sc.nextLine();
        for(int i = userInput.length()-1;i>=0;i--){
            result.append(userInput.charAt(i));
            result1 =result1+userInput.charAt(i);
        }
        System.out.println(result);
        System.out.println(result1);
    }
}
