package LinkedList;

public class find_Sum_doublyLinklist {
    public static void main(String[] args) {
        sumlinklist ll=new sumlinklist();
        ll.insert(1);
        ll.insert(2);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(8);
        int sum=10;
        ll.Find_sum(sum);
    }
}
class sumlinklist {
    sumNode head, tail;

    public void insert(int data) {
        sumNode nn = new sumNode(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }

    public void Find_sum(int sum) {
        if (head == null) {
            System.out.println("empty !!");
            return;
        }
        sumNode left = head;
        sumNode right = tail;
        while (left != null && right != null && left != right) {
            int currentsum = left.data+ right.data;
            if (currentsum == sum) {
                System.out.println("(" + left.data + ", " + right.data + ")");
                left = left.next;
                right = right.prev;
            } else if (currentsum < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
    }
}
class sumNode{
    int data;
    sumNode next;
    sumNode prev;
    public sumNode(int data) {
        this.data = data;
    }
}