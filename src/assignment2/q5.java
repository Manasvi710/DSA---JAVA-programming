package assignment2;

public class q5 {
    public static void main(String[] args) {
        int n = 12345,r;
        int ans = 0, count = 0;
        while(n>0){
            r = n % 10;
            ans = ans + r;
            count++;
            n = n/10;
        }
        System.out.println(ans/count);
    }
}
