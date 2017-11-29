/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prac;

/**
 *
 * @author shivk
 */
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class arrayRotate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int temp = a[0];
            //a[a.length-1] = a[0];
            //a[a.length-2]= temp;
            for(int j = 1;j<a.length-2;j++){
                a[j-1]=a[j];
            }
            a[a.length-1]=temp;
        for(int x = 0; x<a.length;x++){
            System.out.print(a[x]);
        }
    }
}


