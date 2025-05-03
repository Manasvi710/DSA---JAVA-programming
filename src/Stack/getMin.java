package Stack;

import java.util.Stack;

public class getMin {
    static Stack<Integer> stack=new Stack<>();

    static int min=Integer.MAX_VALUE;

    public static void main(String[] args){
        add(10);
        add(20);
        add(12);
        add(5);
        add(7);

        System.out.println(getMin());
    }
    public static void add(int val){
        if(val<min){
            min=val;
        }
        stack.push(val);
    }
    public static int getMin(){
        return min;
    }
}
