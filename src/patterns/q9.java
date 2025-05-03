package patterns;

public class q9 {
    public static void main(String[] args) {
        int n=5;
//        int a=1, b=0;
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(a);
//                int next=a;
//                a=b;
//                b=next;
//            }
//            System.out.println();
//        }
        int a=1, b=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a);
                int next=a;
                a=b;
                b=next;
            }
            System.out.println();
        }
    }
}
