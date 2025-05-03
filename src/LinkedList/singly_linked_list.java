package LinkedList;

import java.util.LinkedList;

public class singly_linked_list {
    public static void main(String[] args) {
        linkedList1 ll=new linkedList1();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.print();
        ll.delete(40);
        System.out.println();
        ll.print();
        ll.update(2, 15);
        System.out.println();
        ll.print();
        System.out.println(ll.find(40));
    }
}

class linkedList1{
    Node head, tail;
    public void insert(int data){
        Node nn=new Node(data);
        if(head == null){
            head = nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }

    public void print() {
        if(head == null){
            System.out.println("empty !!");
        }
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void delete(int data){
//        if(head == null){
//            System.out.println("Link list is empty");
//            return;
//        }
//        if(head.data==data && head==tail){
//            head=tail=null;
//        }else if(head.data == data){
//            head=head.next;
//        }else {
//            Node prev=head;
//            while (prev != null && prev.next.data != data){
//                prev=prev.next;
//            }
//            if(prev.next==tail){
//                prev.next=null;
//                tail=prev;
//            }else {
//                prev.next=prev.next.next;
//            }
//        }
        if(head.data==data && head==tail){
            head=tail=null;
        }else if(head.data==data){
            head=head.next;
        }else{
            Node prev=head;
            while (prev != null && prev.next.data != data){
                prev=prev.next;
            }
            if(prev.next == tail){
                prev.next=null;
                tail=prev;
            }else{
                prev.next=prev.next.next;
            }
        }
    }

    public void update(int index,int newdata){
        if(index<0){
            System.out.println("empty ");
            return;
        }
        Node current=head;
        for(int i=1; i<index; i++){
        if(current == null) {
            System.out.println("Invalid");
            return;
        }
            current=current.next;
        }
        if(current==null) {
            System.out.println("Index invalid");
            return;
        }
        current.data = newdata;
    }

    public boolean find(int data){
        Node current=head;
        while (current != null){
            if(current.data == data){
                return true;
            }
            current=current.next;
        }
        return false;
    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {

        this.data = data;
    }
}

