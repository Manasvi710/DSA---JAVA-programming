package LinkedList;

public class shorted_linkedList {
    public static void main(String[] args) {
        reverse1linklist ll=new reverse1linklist();
        ll.insert(1);
        ll.insert(3);
        ll.insert(6);
        ll.insert(4);
        ll.insert(5);
        ll.insert(2);
        ll.print();
    }
}
class reverse1linklist{
    shortNode head, tail;

    public void insert(int data){
        shortNode nn=new shortNode(data);
        if(head==null){
            head=nn;
        }else if(nn.data <= head.data){
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }else{
            shortNode current=head;
            while (current.next != null && current.next.data < nn.data){
                current=current.next;
            }
            nn.next=current.next;
            if(current.next != null){
                nn.next.prev=nn;
            }
            current.next=nn;
            nn.prev=current;
        }
    }
    public void print(){
        if(head==null){
            System.out.println("empty !!");
            return;
        }
        shortNode temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class shortNode{
    int data;
    shortNode next;
    shortNode prev;

    public shortNode(int data) {
        this.data = data;
    }
}
