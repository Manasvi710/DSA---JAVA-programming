package LinkedList;

public class print_middle_element {
    public static void main(String[] args) {
        linklist5 ll=new linklist5();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.Mid_print();
    }
}
class node5{
    int data;
    node5 next;

    public node5(int data) {
        this.data = data;
    }
}
class linklist5 {
    node5 head, tail;

    public void insert(int data) {
        node5 nn = new node5(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public void Mid_print() {
        node5 slow = head;
        node5 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}


