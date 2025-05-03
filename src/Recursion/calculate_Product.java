package Recursion;

public class calculate_Product {
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        System.out.println(product(n1, n2));
    }
    public static int product(int n1, int n2){
        if(n2==0 ||  n1 ==0){
            return 0;
        }
        return n1+product(n1, n2-1);
    }
}
