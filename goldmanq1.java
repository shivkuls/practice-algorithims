import java.util.Stack;

public class goldmanq1 {
    static String reverse(String expression) {
        Stack<String> st = new Stack<>();
        String reverse = "";
        for(int i =0;i<expression.length()-1;i++){
            for(int j =i+1;j<expression.length()-1;j++) {
                if (expression.charAt(j) == '+' || expression.charAt(j) == '-' ||
                        expression.charAt(j) == '*' || expression.charAt(j) == '/') {
                    st.push(expression.substring(i,j-1));
                    st.push(String.valueOf(j));
                    i=j+1;
                }
            }
        }
        while(!st.empty()) {
            reverse = reverse + st.pop();
        }
        return reverse;
    }
}
