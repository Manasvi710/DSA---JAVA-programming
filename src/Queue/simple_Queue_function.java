package Queue;

public class simple_Queue_function {
    static int front = -1, rear= -1;
    public static void main(String[] args) {
        int [] queue=new int[5];
        System.out.println(isEmpty(queue));
        enqueue(queue, 10);
        enqueue(queue,20);
        enqueue(queue,30);
        enqueue(queue,40);
        enqueue(queue,50);
        print(queue);
        System.out.println();
        dequeue(queue);
        dequeue(queue);
        print(queue);
        isSize();
    }

    private static void enqueue(int [] queue, int value){
        if(rear == queue.length-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear]=value;
    }

    private static void print(int [] queue){
        for(int i=front+1; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
    }

    private static void  dequeue(int [] queue){
        if(front == rear){
            System.out.println("Queue if Empty");
        }
        front++;
        System.out.println(queue[front] + "Queue is remove");
        if(front== rear){
            front = -1;
            rear = -1;
        }
    }
    private static boolean isEmpty(int [] queue){
        if(front == rear){
            return true;
        }
        return false;
    }
    private static void isSize(){
        System.out.println(rear-front);
    }
}
