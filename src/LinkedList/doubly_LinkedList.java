package LinkedList;

public class doubly_LinkedList {
    public static void main(String[] args) {
        doublyLL ll=new doublyLL();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.print();
        System.out.println();
        ll.print_rev();
        ll.delete(30);
        System.out.println();
        ll.print();
        System.out.println();
        ll.print_rev();
    }
}
class doublyLL{
    Noded head, tail;

    public void insert(int data){
        Noded nn=new Noded(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }

    public void print() {
        if(head == null){
            System.out.println("empty !!");
            return;
        }
        Noded temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public void print_rev() {
        if(head == null){
            System.out.println("empty !!");
            return;
        }
        Noded temp=tail;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
    }
    public void delete(int data){
//        if(head.data == data && head == tail){
//            head=tail=null;
//        }else if(head.data == data){
//            head=head.next;
//            head.prev=null;
//        }else {
//            Noded temp=head;
//            while (temp != null && temp.next.data != data){
//                temp=temp.next;
//            }
//            if(temp.next == tail){
//                tail.prev=null;
//                temp.next=null;
//                tail=temp;
//            }else {
//                Noded deleted=temp.next;
//                deleted.next.prev=temp;
//                temp.next=deleted.next;
//                deleted.next=null;  // free the next of deleted node
//                deleted.prev=null;  // free the prev of deleted node
//            }
//        }
        if(head.data==data && head == tail){
            head=tail=null;
        }else if(head.data==data){
            head=head.next;
            head.prev=null;
        }else {
            Noded temp=head;
            while (temp != null && temp.next.data!=data){
                temp=temp.next;
            }
            if(temp.next==tail){
                tail.prev=null;
                temp.next=null;
                tail=temp;
            }else{
                Noded deleted=temp.next;
                deleted.next.prev=temp;
                temp.next=deleted.next;
                deleted.next=null;
                deleted.prev=null;
            }
        }
   }
}
class Noded{
    int data;
    Noded next;
    Noded prev;

    public Noded(int data) {
        this.data = data;
    }
}