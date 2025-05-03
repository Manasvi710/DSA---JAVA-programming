package LinkedList;

public class remove_duplicate_singly_Linklist {
    public static void main(String[] args) {
        R1Linklist ll=new R1Linklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(2);
        ll.insert(4);
        ll.print();
        ll.remove();
        System.out.println();
        ll.print();
    }
}
class R1Linklist{
    R1Node head, tail;
    public void insert(int data){
        R1Node nn=new R1Node(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void print(){
        R1Node temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void remove(){
        R1Node current=head;
        while (current != null){
            R1Node temp=current;
            while (temp.next != null){
                if(temp.next.data == current.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            current=current.next;
        }
    }
}
class R1Node{
    int data;
    R1Node next;

    public R1Node(int data) {
        this.data = data;
    }
}