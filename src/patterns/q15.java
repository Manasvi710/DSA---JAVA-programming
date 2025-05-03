package patterns;

public class q15 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
