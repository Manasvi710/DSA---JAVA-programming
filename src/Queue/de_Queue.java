package Queue;

import java.util.Deque;

public class de_Queue {
    static  int front =-1, rear = -1;
    public static void main(String[] args) {
        int [] queue= new int[5];
        lastadd(queue,10);
        lastadd(queue,20);
        lastadd(queue,30);
        firstadd(queue,1);
        firstadd(queue,2);
        print(queue);
    }
    private static void firstadd(int [] queue, int value){
        if(front == queue.length-1){
            System.out.println("queue is full");
        }else if(front==-1){
            front=rear=0;
            queue[front]=value;
        }else {
            front=front+1;
            queue[front]=value;
        }
    }
    private static void lastadd(int [] queue, int value){
        if(rear==queue.length-1) {
            System.out.println("overflow");
        } else if(rear==-1) {
            rear=0;
            queue[rear]=value;
        }else {
            rear++;
            queue[rear]=value;
        }
    }
    private static void print(int [] queue){
        int i=front;
        while( i !=rear){
            System.out.print(queue[i] + " ");
            i=(i+1)%queue.length;
        }
        System.out.print(queue[rear] + " ");
    } 
    private static void firstdelete(int [] queue){
        if(front==-1) {
            System.out.println(" 1 Deque is empty");
        } else if(front==rear) {
            System.out.print(queue[front] + " ");
            front=-1;
            rear=-1;

        }else {
            System.out.print(queue[front] + " ");
            front=front+1;
        }
    }
    private static void lastdelete(int [] queue){
        if(rear==-1) {
            System.out.println("last Deque is empty");
        } else if(front==rear) {
            System.out.print(queue[rear] + " ");
            front=-1;
            rear=-1;
        }else {
            System.out.print(queue[rear]+ " ");
            rear=rear+1;
        }
    }
}
