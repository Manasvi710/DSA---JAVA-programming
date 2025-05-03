package LinkedList;

public class remove_duplicate_Shorted_doublyLinklist {
    public static void main(String[] args) {
        removeLinklist ll=new removeLinklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(2);
        ll.insert(3);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(5);
        ll.print();
        ll.remove_duplicate();
        System.out.println();
        ll.print();
    }
}
class removeLinklist{
    removeNode head, tail;

    public void insert(int data){
        removeNode nn=new removeNode(data);
        if(head==null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
    }
    public void remove_duplicate(){
        removeNode current=head;
            while (current !=  null && current.next!=null){
                if(current.data == current.next.data){
                 current.next=current.next.next;
                    if(current.next != null) {
                        current.next.prev = current;
                    }
                }else {
                    current = current.next;
                }
        }
    }
    public void print(){
        if(head == null){
            System.out.println("empty !!");
            return;
        }
        removeNode temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class removeNode{
    int data;
    removeNode next;
    removeNode prev;

    public removeNode(int data) {
        this.data = data;
    }
}