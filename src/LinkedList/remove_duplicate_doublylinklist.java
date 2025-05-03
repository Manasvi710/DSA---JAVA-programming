package LinkedList;

public class remove_duplicate_doublylinklist {
    public static void main(String[] args) {
        re1linklist ll=new re1linklist();
       ll.insert(1);
       ll.insert(2);
       ll.insert(2);
       ll.insert(3);
       ll.insert(3);
       ll.insert(5);
       ll.insert(5);
       ll.insert(3);
       ll.insert(1);
       ll.print();
       ll.remove();
       System.out.println();
       ll.print();
    }
}
class re1linklist {
    re1Node head, tail;

    public void insert(int data) {
        re1Node nn = new re1Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    public void print() {
        re1Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void remove() {
        re1Node current = head;
        while (current != null) {
            re1Node temp = current.next;
            while (temp != null) {
                if (temp.data == current.data) {
                    re1Node temp1 = temp;
                    temp.prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                    temp = temp.next;
                    temp1.prev = null;
                    temp1.next = null;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }
}
class re1Node{
    int data;
    re1Node next, prev;

    public re1Node(int data) {
        this.data = data;
    }
}