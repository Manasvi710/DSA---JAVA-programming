package Stack;

import java.util.Stack;

public class palindrome__stack {
    public static void main(String[] args) {
        String str="madam";
        if(isPalindrome(str)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        for(int i=0; i<str.length(); i++){
            if(stack.pop() != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
