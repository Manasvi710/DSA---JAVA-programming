package Queue;

public class circular_Queue {
    static int [] queue=new int[5];
    static int front =1, rear = -1;
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        print();
   //     dequeue();
   //     dequeue();
        enqueue(60);
        System.out.println();
        print();
    //    dequeue();
    }

    private static void enqueue(int value){
        if(rear == -1){
            front=rear=0;
            queue[rear]=value;
        }else if((rear+1)%queue.length == front){
            System.out.println("Queue is overflow");
        }else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
        }
    }

    private static void print(){
       int i=front;
        while( i !=rear){
            System.out.print(queue[i] + " ");
            i=(i+1)%queue.length;
        }
        System.out.print(queue[i]);
    }

//    private static void dequeue(){
//        if(rear == -1){
//            System.out.println("Queue is empty");
//        }else if(front == rear){
//            System.out.println(queue[front] );
//            front=-1;
//            rear =-1;
//        }else{
//            front=(front+1)%queue.length;
//        }
//    }
}
