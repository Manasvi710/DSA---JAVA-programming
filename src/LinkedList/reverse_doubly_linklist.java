package LinkedList;

public class reverse_doubly_linklist {
    public static void main(String[] args) {
        reverselinklist ll=new reverselinklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        ll.Reverse();
        System.out.println();
        ll.print();
    }
}
class reverselinklist{
    reverseNode head,tail;
    public void insert(int data){
        reverseNode nn=new reverseNode(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }
    public void Reverse(){
        if(head == null){
            System.out.println("empty !!");
            return;
        }
        reverseNode temp=null;
        reverseNode current=head;
        while (current != null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        temp=head;
        head=tail;
        tail=temp;
    }
    public void print(){
        reverseNode temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class reverseNode{
    int data;
    reverseNode next;
    reverseNode prev;

    public reverseNode(int data) {
        this.data = data;
    }
}
