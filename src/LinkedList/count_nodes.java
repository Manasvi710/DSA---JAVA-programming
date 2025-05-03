package LinkedList;

public class count_nodes {
    public static void main(String[] args) {
          linklist ll=new linklist();
          ll.insert(1);
          ll.insert(2);
          ll.insert(3);
          ll.insert(4);
          ll.insert(5);
        System.out.println(ll.count());
    }
}
class linklist {
    Node head, tail;

    public void insert(int data) {
        Node nn = new Node(data);
        if(head == null){
            head=nn;
            tail=nn;
        }else{
            tail.next=nn;
            tail=nn;
        }
    }

    public int count() {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
