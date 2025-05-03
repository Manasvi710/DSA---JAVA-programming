package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class collection_framwork {
    public static void main(String[] args) {
        Deque<Integer> queue=new LinkedList<>();
        queue.addFirst(1);
        queue.addFirst(2);
        queue.addFirst(3);
        queue.addLast(4);
        queue.addLast(5);
        System.out.println(queue);
        queue.removeFirst();
        queue.removeLast();
        System.out.println(queue);
    }
}
