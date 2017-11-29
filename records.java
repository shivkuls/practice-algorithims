import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int brokeHighest = 0;
        int brokeLowest = 0;
        int highest = s[0];
        int lowest = s[0];
        int[] brokeRecord = new int[2];
        for(int i =1;i < s.length;i++){
            if(s[i]>highest){
                highest = s[i];
                brokeHighest++;
            }
            if(s[i]<lowest){
                lowest = s[i];
                brokeLowest++;
            }
        }
        brokeRecord[0] = brokeHighest;
        brokeRecord[1] = brokeLowest;
        
        return brokeRecord;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
