package LinkedList;

public class remove_Shorted_duplicate {
    public static void main(String[] args) {
        linklist8 ll=new linklist8();
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);
        ll.insert(5);
        ll.insert(5);
        ll.insert(6);
        ll.Remove_duplicate();
        ll.print();
    }
}
class linklist8{
    node8 head, tail;

    public void insert(int data){
        node8 nn=new node8(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }
    public void Remove_duplicate() {
        node8 current = head;

        while (current != null) {
            node8 prev = current;
            while (prev != null && prev.data== current.data){
                prev=prev.next;

            }
            current.next=prev;
            current=current.next;
        }
    }
    public void print(){
        node8 temp=head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class node8{
    int data;
    node8 next;

    public node8(int data) {

        this.data = data;
    }
}