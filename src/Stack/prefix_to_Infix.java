package Stack;

import java.util.Stack;

public class prefix_to_Infix {
    public static void main(String[] args) {
        String s="+-ab+cd";
        Stack<String> stack=new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                String left=stack.pop();
                String right=stack.pop();
                String newS="(" + left + s.charAt(i) + right + ")";
                stack.push(newS);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
