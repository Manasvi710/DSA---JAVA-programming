package LruCache;

import java.util.*;
public class lruUsingLL {
    public static void main(String[] args) {
        LRU2 lru=new LRU2(4);
        lru.insert(10);
        lru.insert(20);
        lru.insert(30);
        lru.insert(40);
        lru.print();
        lru.search(10);
        System.out.println();
        lru.print();
    }
}
class LRU2{
    final int fixSize;
    public LRU2(int fixSize) {
        this.fixSize = fixSize;
    }
    Doubly ll=new Doubly();
    HashMap<Integer, Node> hashMap=new HashMap<>();


    public void insert(int data) {
        if (fixSize == hashMap.size() && !hashMap.containsKey(data)) {
            hashMap.remove(ll.head.data);
            ll.Delete(ll.head);
            ll.insert(data);
            hashMap.put(data, ll.tail);
        } else {
            ll.insert(data);
            hashMap.put(data, ll.tail);
        }
    }
    public boolean search(int data) {
        if (hashMap.containsKey(data)){
            Node temp=hashMap.get(data);
            ll.Delete(temp);
            hashMap.remove(data);
            ll.insert(data);
            hashMap.put(data,ll.tail);
            return true;
        }
        return false;
    }

    public void print() {
        ll.print();
    }
}
class Doubly{
    Node head,tail;

    public void insert(int data) {
        Node nn=new Node(data);
        if (head==null){
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }

    public void print() {
        if (head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void Delete(Node data) {
        if (head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        if (head==data) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
        else {
            Node curr=head;
            while (curr.next!=null&&curr.next!=data){
                curr=curr.next;
            }
            if (curr.next==null){
                System.out.println("value is not present");
                return;
            }
            if (curr.next==tail){
                tail=curr;
                tail.next=null;
            }
            else {
                Node temp=curr.next;
                curr.next=curr.next.next;
                temp.next.prev=curr;
                temp.next=null;
                temp.prev=null;
            }
        }
    }
}
class Node{
    int data;
    Node next,prev;

    public Node(int data) {
        this.data = data;
    }
}

