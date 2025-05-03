package Recursion;

public class findThe_sumOfDigits {
    public static void main(String[] args) {
        int n=2456;
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + Sum(n/10);
    }
}
