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
public class codility {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int index = 0;
        int value = 0;
        int prefixAmount = 0;
        
        for(int i = 0;i<A.length;i++){
            index += i+1;
            value += A[i];
            if(index == value){
                prefixAmount++;
            }
        }
        return prefixAmount;
    }
 }
