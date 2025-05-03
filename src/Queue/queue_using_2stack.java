package Queue;

import java.util.Stack;

public class queue_using_2stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        insert(stack,10);
        insert(stack,20);
        insert(stack,30);
        System.out.println(stack);
        delete(stack);
        insert(stack,40);
        System.out.println(stack);
    }
    private static void insert(Stack<Integer> stack, int value){

        stack.push(value);
    }
    private static void delete(Stack<Integer> stack){
        Stack<Integer> tempstack=new Stack<>();
        for(int i=0; i<stack.size(); i++){
            tempstack.push(stack.pop());
        }
        stack.pop();
        while (!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }

    }
}
