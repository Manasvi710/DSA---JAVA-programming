package LinkedList;

public class exchange_1st_last_Node_circular {
    public static void main(String[] args) {
        exchange ll=new exchange();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.print();
        ll.swap();
        ll.print();
    }
}
class exchange{
    noded1 head;

    public void insert(int data){
        noded1 nn=new noded1(data);
        if(head==null){
            head=nn;
            nn.next=head;
        }else {
            noded1 temp=head;
            while (temp.next != head){
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
        }
    }
    public void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        noded1 current = head;
        while (current.next != head) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public void swap(){
        noded1 temp=head;
        while (temp.next != head){
            temp=temp.next;
        }
        noded1 prev=head;
        while (prev.next != temp){
            prev=prev.next;
        }
        temp.next=head.next;
        head.next=prev.next;
        prev.next=head;
        head=temp;
    }
}
class noded1{
    int data;
    noded1 next;

    public noded1(int data) {
        this.data = data;
    }
}