package Stack;

import java.util.Stack;

public class delete_middleElement_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        delete(stack);
        System.out.println(stack);
    }
    public static void delete(Stack<Integer> stack){
        Stack<Integer> tempstack=new Stack<>();
        for(int i=0; i<stack.size()/2; i++){
            tempstack.push(stack.pop());
        }

        stack.pop();
        while (!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }
    }
}
