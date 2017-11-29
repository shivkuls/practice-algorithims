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
public class ipAddrVerif {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        System.out.println(numLines);
        
        
        for(int i = 0; i <= numLines;i++){
            byte ipAddr = sc.nextByte();
            if(ipAddr>= 4 && ipAddr<7){
                System.out.println("IPv4");
            }else{
                System.out.println("IPv6");
            }
        }
        
    }
}
