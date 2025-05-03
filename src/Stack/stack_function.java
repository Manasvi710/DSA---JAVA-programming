package Stack;

public class stack_function {
    public static void main(String[] args) {
        int[]stack =new int[4];
        int top=-1;
        System.out.println(isEmpty(top));
        top=push(stack, top, 10);
        top=push(stack, top, 20);
        top=push(stack, top, 30);
        top=push(stack, top, 40);
        print(stack, top);
        System.out.println("before pop");
        top=pop(stack, top);
        System.out.println("after pop");
        print(stack, top);
        System.out.println(peek(stack,top));
        System.out.println(size(top));

    }

    private static int push(int [] stack, int top, int value){
        if(top==stack.length-1){
            System.out.println("stack is overflow!");
            return  top;
        }
        top++;
        stack[top]=value;
        return top;
    }

    private static void print(int [] stack, int top){
        for(int i=top; i>=0; i--){
            System.out.print(stack[i] + " ");
        }
    }
    private static int pop(int [] stack, int top){
        if(top==-1){
            System.out.println("stack is empty");
            return top;
        }
        System.out.println(stack[top] + "is popped");
        top--;
        return top;
    }
    public static boolean isEmpty(int top){
        if(top==-1){
            return true;
        }
        return false;
    }
    private static int peek(int []stack, int top){

        return stack[top];
    }

    private static int size(int top){

        return top+1;
    }
}
