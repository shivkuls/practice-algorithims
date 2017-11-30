import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int result = 0;
        String magazine[] = new String[m];
        Map<String,Integer> map = new HashMap<>();
        int c = 1;
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next().toLowerCase();
            if(map.containsValue(magazine[magazine_i])){
                map.put(magazine[magazine_i], c+1);
            }else{
                map.put(magazine[magazine_i], c);
            }
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next().toLowerCase();
            if(map.containsValue(ransom[ransom_i]))
                result++;
        }
        if(result == ransom.length-1)
            System.out.println("Yes");
        else
            System.out.println("No");

     }
}
