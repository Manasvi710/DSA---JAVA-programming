package Stack;

import java.util.Stack;

public class remove__duplicate {
    public static void main(String[] args) {
        String s="abbaca";
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }else if(stack.peek()==c){
               stack.pop();
            }else {
                stack.push(c);
            }
        }
        System.out.println(stack);
    }
}
