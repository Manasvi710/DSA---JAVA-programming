package Queue;

import java.util.*;

public class reverse_1stK_element {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int k=3;
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       reverse(stack,k);
    }
    private static void reverse(Stack<Integer> stack, int k){
        Stack<Integer> s1=new Stack<>();
        for(int i=0; i<k ; i++){
            s1.push(stack.pop());
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        for(int i=0; i<s1.size()-k; i++){
            stack.push(s1.pop());
        }
        while (!s1.isEmpty()){
            System.out.print(s1.pop() + " ");
        }
    }
}
