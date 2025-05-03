package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stack_using_2Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        insert(queue,10);
        insert(queue,20);
        insert(queue,30);
        System.out.println(queue);
        delete(queue);
        insert(queue,40);
        System.out.println(queue);
    }
    private static void insert(Queue<Integer> queue, int value){
        queue.add(value);
    }
    private static void delete(Queue<Integer> queue){
        Queue<Integer> tempQueue=new LinkedList<>();
        for(int i=0; i<queue.size(); i++){
            tempQueue.add(queue.poll());
        }
        queue.poll();
        while (!tempQueue.isEmpty()){
            queue.add(tempQueue.poll());
        }
    }
}
