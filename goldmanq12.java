import java.util.*;

public class goldmanq12 {
    public static void main(String[] args) {
        System.out.println("Enter Expression to Reverse");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Result: " + reverseExpression(s));
    }
    public static String reverseExpression(String s){
        Stack<String> st = new Stack<>();
        String response = "";
        Set<Character> set = new HashSet<>();
        set.add('+');set.add('-');set.add('*');set.add('/');
        char[] arr = s.toCharArray();
        int i = 0;
        int j = 1;
        for(i=i;i<arr.length;i++){
            for(j = i+1;j<arr.length;j++){
                if(set.contains(s.charAt(j))){
                    st.push(s.substring(i,j));
                    st.push(String.valueOf(s.charAt(j)));
                    i = j+1;
                }
                else if(j==arr.length-1 && Integer.valueOf(s.substring(i,j+1))!=0){
                    st.push(s.substring(i,j+1));
                }
            }
        }
        while(!st.empty()){
            response = response + st.pop();
        }
        return response;
    }
}
