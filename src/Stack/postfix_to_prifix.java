package Stack;

import java.util.Stack;

public class postfix_to_prifix {
    public static void main(String[] args) {
        String s="AB+CD-*";
        Stack<String> stack=new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                String left = stack.pop();
                String right = stack.pop();
                String newS = s.charAt(i) + right + left;
                stack.push(newS);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
