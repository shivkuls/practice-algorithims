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
public class codility2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> destinations = new HashSet<>();
        int vacationLength = 0;
        
        for(int i = 0; i < A.length; i++){
            if(!destinations.contains(A[i]))
                destinations.add(A[i]);
        }
        vacationLength = (int)destinations.size() + 1;
        return vacationLength;
    }
}
