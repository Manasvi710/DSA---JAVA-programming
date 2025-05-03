package exam1;

public class q1 {
    public static void main(String[] args) {
        int n=5;
//        for(int i=1; i<=n; i++){
//          for(int j=1; j<=i; j++){
//              System.out.print("*");
//          }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++){
//            for(int k=n; k>i; k--){
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
        for(int i=1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1|| j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for(int j=2*i-1; j>=1; j--){
                if(j==1 || j==2*i-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
