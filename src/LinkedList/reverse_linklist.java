package LinkedList;

import java.util.Stack;

public class reverse_linklist {
    public static void main(String[] args) {
       linkedlist ll=new linkedlist();
       ll.inset(1);
       ll.inset(2);
       ll.inset(3);
       ll.inset(4);
       ll.inset(5);
       ll.reverse();
    }
}
class linkedlist{
    Node1 head,tail;
    public void inset(int data){
        Node1 nn=new Node1(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=nn;
        }
    }
    public void reverse(){
        Stack<Integer> stack=new Stack<>();
        Node1 temp=head;
        while (temp != null){
            stack.push(temp.data);
            temp=temp.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
class Node1{
    int data;
    Node1 next;

    public Node1(int data) {

        this.data = data;
    }
}
