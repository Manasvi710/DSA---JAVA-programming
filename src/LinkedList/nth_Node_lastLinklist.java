package LinkedList;

import java.util.Stack;

public class nth_Node_lastLinklist {
    public static void main(String[] args) {
        linelist3 ll=new linelist3();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.Nth_Node_last(2);
    }
}
class linelist3{
    Node3 head,tail;

    public void insert(int data){
        Node3 nn=new Node3(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=nn;
        }
    }
    public void Nth_Node_last(int n){
        Stack<Integer> stack=new Stack<>();
        Node3 temp=head;
        while (temp != null){
            stack.push(temp.data);
            temp=temp.next;
        }
        int c=1;
        while (!stack.isEmpty() && c!= n){
            c++;
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println("no value");
            return;
        }
        System.out.println(stack.pop());
    }
}
class Node3{
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
    }
}