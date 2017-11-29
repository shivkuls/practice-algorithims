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
public class Recurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter chars: ");
        String chars = sc.nextLine();
        char[] str = chars.toCharArray();
        for(int i = 0;i<str.length;i++){
            for(int j = i+1;j<str.length;j++){
                if(str[j] ==str[i]){
                    System.out.println(str[j]);
                 }
                
            }
            break;
        }
    }
}
