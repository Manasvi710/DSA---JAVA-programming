package LinkedList;

public class delete_pointer_element {
    public static void main(String[] args) {
          linklist4 ll=new linklist4();
          ll.insert(1);
          ll.insert(2);
          ll.insert(3);
          ll.insert(4);
          ll.insert(5);
          ll.print();
          ll.Pointer_Delete(ll.head.next);
          System.out.println();
          ll.print();
    }
}
class linklist4{
    node4 head,tail;

    public void insert(int data){
        node4 nn=new node4(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=nn;
        }
    }
    public void print(){
        node4 temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void Pointer_Delete(node4 p){
//        p.data=p.next.data;
//        p.next=p.next.next;
        p.data=p.next.data;
        p.next=p.next.next;
    }
}
class node4{
    int data;
    node4 next;

    public node4(int data) {
        this.data = data;
    }
}