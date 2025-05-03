package Stack;

import java.util.Stack;

public class getMin_1 {
    static Stack<Integer>stack=new Stack<>();
    static Stack<Integer>minstack=new Stack<>();
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(3);
        remove();
        System.out.println(getmin());
    }
    public static void add(int val){
        if(minstack.isEmpty()){
            minstack.push(val);
        }else if(val<minstack.peek()){
            minstack.push(val);
        }
        stack.push(val);
    }
    public static void remove(){
        int popval=stack.pop();
        if(popval==minstack.peek()){
            minstack.pop();
        }
    }
    public static int getmin(){
        return minstack.peek();
    }
}
