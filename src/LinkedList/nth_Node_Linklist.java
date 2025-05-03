package LinkedList;

public class nth_Node_Linklist {
    public static void main(String[] args) {
        Linkedlist2 ll=new Linkedlist2();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.Nth_Node(2);
    }
}
class Linkedlist2{
    node2 head, tail;

    public void insert(int data){
        node2 nn=new node2(data);
        if(head==null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=nn;
        }
    }
    public void Nth_Node(int n){
        node2 temp=head;
        int c=0;
        while (temp != null){
            c++;
            if(c==n){
                System.out.println(temp.data);
                return;
            }
            temp=temp.next;
        }
    }
}
class node2{
    int data;
    node2 next;

    public node2(int data) {
        this.data = data;
    }
}