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
public class StringUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] arr = in.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Not Unique");
                System.exit(0);
            }
            else if(!set.contains(arr[i])){
                set.add(arr[i]);
                //System.out.println(set);
            }
        }
        System.out.println("Unique");
    }
}
