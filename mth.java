/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceProblems;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Shiv
 */
public class mth {
   public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int k=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n = sc.nextInt();
        
        while(sc.hasNextInt()){
            numbers.add(sc.nextInt());
            System.in.close();        
        }
        
        if(n < numbers.size()){
            k = numbers.size()-n;
            System.out.println(numbers.get(k));
        }
        else{
            System.out.println("NIL");
        }
    } 
}


