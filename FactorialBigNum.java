/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
/**
 *
 * @author Shiv
 */
import java.io.*;
import java.util.*;

public class FactorialBigNum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger result=BigInteger.ONE;;
        if(n==BigInteger.ZERO){System.out.println(BigInteger.ONE);}
        else {
            for(BigInteger i = n; !i.equals(BigInteger.ZERO);i.subtract(BigInteger.ONE)){
                result=result.multiply(i);
            }
        } 
        
        System.out.println(result);
    }
}
