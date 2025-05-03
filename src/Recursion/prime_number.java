package Recursion;

public class prime_number {
    public static void main(String[] args) {
        int n=17;
        if(prime(n,2)){
            System.out.println("prime");
            return;
        }
        System.out.println("not prime");

    }
    public static boolean prime(int n, int d){
        if(n<=1){
            return false;
        }
        if(n==d){
            return true;
        }
      if(n%d ==0){
          return false;
      }
      return prime(n, d+1);
    }
}
