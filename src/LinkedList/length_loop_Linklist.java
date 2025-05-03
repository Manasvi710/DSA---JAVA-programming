package LinkedList;

public class    length_loop_Linklist {
    public static void main(String[] args) {
        linklist7 ll=new linklist7();
        ll.Insert(1);
        ll.Insert(2);
        ll.Insert(3);
        ll.Insert(4);
        ll.Insert(5);
        ll.Insert(6);
        ll.Insert(7);
        System.out.println(ll.Loop());
        ll.Length_loop();
    }
}
class linklist7 {
    node7 head, tail;

    public void Insert(int data) {
        node7 nn = new node7(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }
    public boolean Loop(){
        node7 slow=head;
        node7 fast=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void Length_loop() {
        node7 fast = head;
        node7 slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                slow = slow.next;
                int count = 0;
                while (slow != fast) {
                    slow = slow.next;
                    count++;
                }
                System.out.println(count);
                return;
            }
        }
    }
}
class node7{
    int data;
    node7 next;

    public node7(int data) {
        this.data = data;
    }
}