package Thread;

public class que1_OddEvenTread {
    public static void main(String[] args) {
        printer oddObj=new printer(1);
        printer evenObj=new printer(0);

        Thread odd=new Thread(oddObj);
        Thread even=new Thread(evenObj);

        odd.start();
        even.start();
    }
}
class printer implements Runnable{
    static int count =1;
    int reminder;
    static Object lock=new Object();

    printer(int reminder) {

        this.reminder=reminder;
    }

    public void printer(){
        System.out.println((count++) + " " + Thread.currentThread());
    }
    @Override
    public void run() {
        int n=10;
        for(int i=0; i<=n; i++){
            if(count >= n) break;
            synchronized (lock){
                while (count % 2 != reminder){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
                printer();
                lock.notifyAll();
            }
        }
    }
}