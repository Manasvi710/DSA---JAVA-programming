package LinkedList;

public class delete_Pointer_doublyLinkList {
    public static void main(String[] args) {
        pointerlinklist ll=new pointerlinklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        ll.Pointer_delete(ll.head.next.next);
        System.out.println();
        ll.print();
    }
}
class pointerlinklist{
    pointerNode head, tail;

    public void insert(int data){
        pointerNode nn=new pointerNode(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }
//    public void Pointer_delete(pointerNode p){
//        if(p== head){
//            head=p.next;
//        }
//        if(p.prev != null){
//            p.prev.next=p.next;
//        }
//        if(p.next != null){
//            p.next.prev=p.prev;
//        }
//    }
    public void Pointer_delete(pointerNode p){
        if(p==head){
            head=p.next;
        }
        if(p.prev != null){
            p.prev.next=p.next;
        }
        if(p.next != null){
            p.next.prev=p.prev;
        }
    }
    public void print(){
        if(head == null){
            System.out.println("empty !!");
            return;
        }
        pointerNode temp=head;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class pointerNode{
    int data;
    pointerNode next;
    pointerNode prev;

    public pointerNode(int data) {
        this.data = data;
    }
}