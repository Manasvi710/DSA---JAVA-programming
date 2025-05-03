package practice;

public class patterns {
    public static void main(String[] args) {
//        int n=5;
//        for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int n=5;
//        int k=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(k + " ");
//                k++;
//            }
//            System.out.println();
//        }
//        int n=5;
//        int a=1, b=0;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(a);
//                int temp=a;
//                a=b;
//                b=temp;
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=n; j>=1; j--){
//                if(j!=i) {
//                    System.out.print(j);
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            int num=i;
//            for(int j=1; j<=i; j++){
//                System.out.print(num + " ");
//                num +=i;
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int k=n; k>i; k--){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=2*i-1; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=n; i>=1; i--){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=i*2-1; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=2; i<=n; i++){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i*2-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i==1 || j==1|| i==n|| j==n) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        int n=5;
//        for(int i=1; i<=n; i++){
//            for(int k=i; k<n; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i*2-1; j++){
//                if(j==1|| j==i*2-1 || i==n) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        int n=5;
        for(int i=1; i<=n; i++){
            for(int k=i; k<n; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int k=i; k<n; k++){
                System.out.print(" ");
            }
            for(int j=2*i-1; j>=1; j--){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
