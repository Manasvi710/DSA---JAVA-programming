package Stack;

import java.util.Stack;

public class reverse_String_stack {
    public static void main(String[] args) {
        String s = "manasvi";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}