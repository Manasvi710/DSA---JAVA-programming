package Thread;

public class thread_use {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            Testthread testthread=new Testthread(i);
            Thread t1=new Thread(testthread);
            t1.start();
        }
    }
}
//class Testthread extends Thread{
//    int no;
//    public Testthread(int no){
//        this.no=no;
//    }
//    public void run(){
//        System.out.println("running " + no);
//    }
//}

class Testthread implements Runnable{
    int no;
    public Testthread(int no){
        this.no=no;
    }

    @Override
    public void run() {
        System.out.println("running " + no);
    }
}