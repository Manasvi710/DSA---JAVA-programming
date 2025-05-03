package Stack;

public class implement_twoStack {
    public static void main(String[] args) {
        int [] stack=new int[5];
        int top1=-1;
        int top2=stack.length-1;
        top1=push1(stack,top1,top2,10);
        top1=push1(stack,top1,top2,20);
        top1=push1(stack,top1,top2,30);
        top2=push2(stack,top1,top2,40);
        top2=push2(stack,top1,top2,50);


        System.out.println(peek1(stack,top1));
        System.out.println(peek2(stack, top2));
        top1=pop1(stack,top1);
        System.out.println(peek1(stack,top1));
        top2=push2(stack,top1,top2,60);
        System.out.print(peek2(stack, top2));

    }
    private static int push1(int [] stack, int top1, int top2,int value){
        if(top1==top2-1){
            System.out.println("stack is overflow");
            return  top1;
        }
        top1++;
        stack[top1]=value;
        return top1;
    }
    private static int push2(int [] stack, int top1, int top2,int value){
        if(top1==top2-1){
            System.out.println("stack is overflow");
            return  top2;
        }
        top2--;
        stack[top2]=value;
        return top2;
    }
    private static int pop1(int [] stack, int top1){
        if(top1==-1){
            System.out.println("stack is Empty");
            return top1;
        }
        top1--;
        return top1;
    }
    private static int pop2(int [] stack, int top2){
        if(top2== stack.length-1){
            System.out.println("stack is Empty");
            return top2;
        }
        top2++;
        return top2;
    }
    private static int peek1(int []stack, int top1){

        return stack[top1];
    }
    private static int peek2(int []stack, int top2){

        return stack[top2];
    }
}
