import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s1, String s2){
        boolean result = false;

        if(s1.length() != s2.length())
            return result;

        Set<Character> set = new HashSet<>();

        for(int i = 0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        for(int i = 0;i<s2.length();i++){
            if(set.contains(s2.charAt(i)));
            result = true;
        }
        return result;
    }
}
