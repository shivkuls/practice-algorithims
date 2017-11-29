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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class grades {

    static int[] solve(int[] grades){
        // Complete this function
        for(int i =0;i<grades.length;i++){
            if(grades[i]>=38){
                for(int j =grades[i];j<(grades[i]+5);j++){
                    if(j%5==0){
                        if(j-grades[i]<=3)
                            grades[i]=j;
                    }
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
