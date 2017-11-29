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
public class Hundred {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,0,8,9};
        int XOR = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] != 0)
                XOR ^= array[i];
            XOR ^= (i + 1);
         }
        System.out.println(XOR);
        
        
        /*
        for(int i =1;i<=100;i++){
            if(array[i] != array[i-1]+1 && array[i] != array[i+1]-1){
                System.out.println(i);
                */
            }
        }
    

