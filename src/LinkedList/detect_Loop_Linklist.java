package LinkedList;

public class detect_Loop_Linklist {
    public static void main(String[] args) {
        linkelist6 ll=new linkelist6();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);
        System.out.println(ll.Detect_Loop());
    }
}
class linkelist6 {
    node6 head, tail;

    public void insert(int data) {
        node6 nn = new node6(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public boolean Detect_Loop() {
        node6 fast = head;
        node6 slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
class node6{
    int data;
    node6 next;

    public node6(int data) {
        this.data = data;
    }
}