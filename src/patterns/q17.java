package patterns;

public class q17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=2*i; j>=2; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=2; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
