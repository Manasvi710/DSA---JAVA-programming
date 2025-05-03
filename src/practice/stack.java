package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
//    static Stack<Integer> stack=new Stack<>();
//    static Stack<Integer> minstack=new Stack<>();

    public static void main(String[] args) {
//        int [] stack=new int[5];
//        int top=-1;
//        System.out.println(isEmpty(top));
//        top=push(stack,top,10);
//        top=push(stack,top,20);
//        top=push(stack,top,30);
//        System.out.println(isEmpty(top));
//        top=push(stack,top,40);
//        top=push(stack,top,50);
//        print(stack, top);
//        top=pop(stack, top);
//        System.out.println();
//        print(stack,top);
//        System.out.println();
//        System.out.println(peek(stack,top));
//        System.out.println(size(top));
//    }
//    private static int push(int [] stack, int top, int value){
//        if(top== stack.length-1){
//            System.out.println("stack is overflow");
//            return top;
//        }
//        top++;
//        stack[top]=value;
//        return top;
//    }
//
//    private static void print(int [] stack, int top){
//        for(int i=top; i>=0; i--){
//            System.out.print(stack[i] + " ");
//        }
//    }
//    private static int pop(int[] stack, int top){
//        if(top==-1){
//            System.out.println("is Empty");
//            return top;
//        }
//        top--;
//        return top;
//    }
//    private static boolean isEmpty(int top){
//        if(top==-1){
//            return true;
//        }
//        return false;
//    }
//    private static int peek(int []stack, int top){
//        return stack[top];
//    }
//
//    private static int size(int top){
//        return top+1;
//        String s="hello world";
//        Stack<Character> stack=new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == ' '){
//                while (!stack.isEmpty()){
//                    System.out.print(stack.pop());
//                }
//                System.out.print(" ");
//            }else{
//                stack.push(s.charAt(i));
//            }
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop());
//        }


//        String s="madam";
//        if(isPalindrome(s)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//     }
//     public static boolean isPalindrome(String s){
//        Stack<Character> stack=new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            stack.push(s.charAt(i));
//        }
//        for(int i=0; i<s.length(); i++){
//            if(stack.pop() != s.charAt(i)){
//                return false;
//            }
//        }
//        return true;


//     Stack<Integer> stack=new Stack<>();
//     stack.push(10);
//     stack.push(20);
//     stack.push(30);
//     stack.push(40);
//     stack.push(50);
//        System.out.println(stack);
//        delete(stack);
//        System.out.println(stack);
//
//     }
//     public static void delete(Stack<Integer> stack){
//        Stack<Integer> tempstack=new Stack<>();
//        for(int i=0; i< stack.size()/2; i++){
//            tempstack.push(stack.pop());
//        }
//        stack.pop();
//        while (!tempstack.isEmpty()){
//            stack.push(tempstack.pop());
//        }

//         add(10);
//         add(4);
//         add(8);
//         add(1);
//         add(9);
//        System.out.println(getmin());
//     }
//     public static void add(int val){
//        if(val < min){
//            min=val;
//        }
//         stack.push(val);
//     }
//     public static int getmin(){
//        return min;

//        add(10);
//        add(3);
//        add(6);
//        System.out.println(getmin());
//     }
//     public static void add(int val){
//        if(minstack.isEmpty()){
//            minstack.push(val);
//        }else if(val<minstack.peek()){
//            minstack.push(val);
//        }
//        stack.push(val);
//     }
//     public static void remove(int val){
//        int popval=stack.pop();
//        if(popval<minstack.peek()) {
//            minstack.pop();
//        }
//     }
//     public static int getmin(){
//        return minstack.peek();

//         String expression="({[]})";
//         if(balanceParentheses(expression)){
//             System.out.println("balance");
//         }else{
//             System.out.println("not balance");
//         }
//
//     }
//     public static boolean balanceParentheses(String s){
//        Stack<Character> stack=new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            char ch=s.charAt(i);
//            if(ch == '(' || ch== '{' || ch=='['){
//                stack.push(ch);
//            }else{
//                if(stack.isEmpty()){
//                    return false;
//                }
//                char top=stack.pop();
//                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();

//        String s="+-ab+cd";
//        Stack<String> stack=new Stack<>();
//
//        for(int i=s.length()-1; i>=0; i--){
//            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
//                String left=stack.pop();
//                String right=stack.pop();
//                String newS= "(" + left + s.charAt(i) + right + ")";
//                stack.push(newS);
//            }else {
//                stack.push(String.valueOf(s.charAt(i)));
//            }
//        }
//        System.out.println(stack.peek());

//        String s="abbaca";
//        Stack<Character> stack=new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            char ch=s.charAt(i);
//            if(stack.isEmpty()){
//                stack.push(ch);
//            }else if(stack.peek() == ch){
//                stack.pop();
//            }else {
//                stack.push(ch);
//            }
//        }
//        System.out.println(stack);

//        String expression="([{}])(){";
//        if(balanceParentheses(expression)){
//            System.out.println("balance");
//        }else{
//            System.out.println("not balance");
//        }
//    }
//     public static boolean balanceParentheses(String str) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//             char top = stack.pop();
//             if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
//                 return false;
//             }
//         }
//     }
//        return stack.isEmpty();

//        String s="+-ab*cd";
//        Stack<String> stack=new Stack<>();
//
//        for(int i=s.length()-1; i>=0; i--){
//            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
//                String left=stack.pop();
//                String right=stack.pop();
//                String newS= "(" + left + s.charAt(i) + right + ")";
//                stack.push(newS);
//            }else{
//                stack.push(String.valueOf(s.charAt(i)));
//            }
//        }
//        System.out.println(stack.peek());


//        String s="ab-cd+*";
//        Stack<String> stack=new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
//                String right=stack.pop();
//                String left=stack.pop();
//                String newS= left + right+s.charAt(i);
//                stack.push(newS);
//            }else {
//                stack.push(String.valueOf(s.charAt(i)));
//            }
//        }
//        System.out.println(stack.peek());


//        String s="madam";
//        if(isPalindrome(s)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//     }
//     public static boolean isPalindrome(String s){
//        Stack<Character> stack=new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            stack.push(s.charAt(i));
//        }
//        for(int i=0; i<s.length(); i++){
//            if(stack.pop() != s.charAt(i)){
//                return false;
//            }
//        }
//        return true;

//        String s="hello World";
//        Stack<Character> stack=new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == ' '){
//                while (!stack.isEmpty()){
//                    System.out.print(stack.pop());
//                }
//                System.out.print(" ");
//            }else {
//                stack.push(s.charAt(i));
//            }
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop());
//        }


//        String s="abbaca";
//        Stack<Character> stack=new Stack<>();
//
//        for(int i=0; i<s.length(); i++){
//            char ch=s.charAt(i);
//            if(stack.isEmpty()) {
//                stack.push(ch);
//            }else if(stack.peek() == ch){
//                stack.pop();
//            }else {
//                stack.push(ch);
//            }
//        }
//        System.out.println(stack);

//        Stack<Integer> stack=new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        System.out.println(stack);
//        delete(stack);
//        System.out.println(stack);
//     }
//     public static void delete(Stack<Integer> stack){
//        Stack<Integer> tempstack=new Stack<>();
//
//        for(int i=0; i<stack.size()/2; i++){
//            tempstack.push(stack.pop());
//        }
//        stack.pop();
//        while (!tempstack.isEmpty()){
//            stack.push(tempstack.pop());
//        }


//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);
//    }
//    public static void reverse(Queue<Integer> queue){
//        Stack<Integer> stack=new Stack<>();
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop() + " ");
//        }
//        for(int i=0; i<queue.size(); i++){
//            stack.push(queue.poll());
//        }
//        while (!queue.isEmpty());
//        System.out.print(queue.poll() + " ");

      int [] stack={2,4,1,5,6,3};
      int n=stack.length;
      smallest(stack, n);
    }
    static void smallest(int [] stack, int n){
        Stack<Integer> s=new Stack<>();
        s.push(stack[0]);
        for(int i=0; i<n; i++){
          if(s.isEmpty()){
              s.push(stack[i]);
              continue;
          }
          while (!s.isEmpty() && s.peek() < stack[i]){
              System.out.println(s.peek() + " " + stack[i]);
              s.pop();
          }
          s.push(stack[i]);
        }
        while (!s.isEmpty()){
            System.out.println(s.peek() + " " + -1);
            s.pop();
        }
    }
}
