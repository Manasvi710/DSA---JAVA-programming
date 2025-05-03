package Stack;

import java.util.Stack;

public class monotonic_stack {
    public static void main(String[] args) {
       int [] stack={10,12,24,11,9};
       int n=stack.length;
       print(stack,n);
    }
    static void print(int [] stack, int n){
        Stack<Integer> s=new Stack<>();
        s.push(stack[0]);
        for(int i=0; i<n; i++){
            if(s.isEmpty()){
            s.push(stack[i]);
            continue;
        }
        while (!s.isEmpty() && s.peek() <stack[i]) {
            System.out.println(s.peek() + " " + stack[i]);
            s.pop();
         }
        s.push(stack[i]);
        }
//        while (!s.isEmpty()) {
//            System.out.println(s.peek() + " " + -1);
//            s.pop();
//        }
    }
}
