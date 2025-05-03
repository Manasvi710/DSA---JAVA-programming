package patterns;

public class q20 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=(n-1); i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=2*i; j>=2; j--){
                if(j==2 || j==(2*i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}