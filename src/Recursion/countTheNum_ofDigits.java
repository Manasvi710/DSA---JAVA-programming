package Recursion;

public class countTheNum_ofDigits {
    public static void main(String[] args) {
        int number=1234;
        System.out.println(countDigit(number));
    }
    public static int countDigit(int number){
        if(number==1){
            return 1;
        }
        return 1 + countDigit(number/10);
    }
}
