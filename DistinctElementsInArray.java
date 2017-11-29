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
public class DistinctElementsInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,6,7,2};
        
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i = 0; i <arr.length;i++){
            if(! hash.contains(arr[i]))
                hash.add(arr[i]);
        }
        System.out.println(hash.toString());
        
        //StringBuilder sb = new StringBuilder();
        System.out.println("Enter Word  ");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        
    }
}
