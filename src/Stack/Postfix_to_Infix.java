package Stack;

import java.util.Stack;

public class Postfix_to_Infix {
    public static void main(String[] args) {
        String s="ab*c+";
        Stack <String> stack=new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                String left = stack.pop();
                String right = stack.pop();
                String newS = "(" + right + s.charAt(i) + left + ")";
                stack.push(newS);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
