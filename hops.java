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

public class hops {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result =null;
        for(int i = x1;i<9999999;i+=v1){
            for(int j =x2;j<99999;j+=v2)
                if(i == j)
                    result = "YES";
                else
                    result = "NO";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
