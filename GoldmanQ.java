/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;

import java.util.Arrays;


/**
 *
 * @author Shiv
 */
public class GoldmanQ {
    
static int countPairs(int k, int[] a) {
        int count = 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; i < a.length; j++){
                if((a[i] + a[j]) == k){
                    count++;
                }
            }
        }
                   
          return count;      

    }
}


