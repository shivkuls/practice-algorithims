import java.util.Scanner;

/**
 *
 * @author Shiv
 */
public class Balance {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String brac = sc.nextLine();
        char[] arr = brac.toCharArray();
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == '{' && arr[arr.length-1-i] == '}' 
                    ||arr[i] == '[' && arr[arr.length-1-i] == ']'
                    ||arr[i] == '(' && arr[arr.length-1-i] == ')' )
                count++;
        }
        //System.out.println(count);
        System.out.println((arr.length)/2);
        
        if(count == ((arr.length)/2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
