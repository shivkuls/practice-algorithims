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
public class Distinct {
    public int distinctElements(int []n, int k){
        int count =0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < i; j++){
                if(n[j] != n[j+1])
                    count++;
            }
        }
        return count;
    }
}
