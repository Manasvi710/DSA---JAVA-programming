package basicprogram;

public class fibonaciseries {
    public static void main(String[] args) {
//        int i;
//        int n=7;
//        int a=0, b=1;
//        for(i=1; i<=n; i++)
//        {
//            System.out.println(a);
//            int next=a+b;
//            a=b;
//            b=next;
//        }

        int n=5;
        int a=0;
        int b=1;
        for(int i=1; i<=n; i++){
            System.out.print(a);
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
