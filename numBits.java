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
public class numBits {
        public int numSetBits(long a) {
        int totalOnes=0;
        long z=a;
        while(z!=0){

        totalOnes+=z & 1;
        z=z - 1;
    }
    return totalOnes;
}
}
