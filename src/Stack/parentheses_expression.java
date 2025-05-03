package Stack;

import java.util.Stack;

public class parentheses_expression {
    public static void main(String[] args) {
        String expression="({[()]})";
        if(BalanceParentheses(expression)){
            System.out.println("parentheses are balanced");
        }else {
            System.out.println("parentheses are not balanced");
        }
    }
    public static boolean BalanceParentheses(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top != '(') || (ch=='}' && top!='{') || (ch ==']' && top != '[') ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
