package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class insert_heavy {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        insert(stack,10);
        insert(stack,20);
        insert(stack,30);
        System.out.println(stack);
        delete(stack);
        System.out.println(stack);
    }
    private static void insert(Stack<Integer> stack, int value){
        Stack<Integer> tempstack=new Stack<>();
        if(stack.isEmpty()){
            stack.push(value);
        }
        while (!stack.isEmpty()){
            tempstack.push(stack.pop());
        }
        stack.push(value);
        while (!tempstack.isEmpty());
        stack.push(tempstack.pop());
    }
    private static void delete(Stack<Integer> stack){
        stack.pop();


        }
}
