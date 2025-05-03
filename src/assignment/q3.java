package assignment;

public class q3 {
    public static void main(String[] args) {
        int n = 4421, r;
        int product = 1, sum = 0;
        int m = n;
        while(m > 0)
        {
            r = m % 10;
           product = product*r;
           sum = sum + r;
           m = m/10;
        }
        int ans = product - sum;
        System.out.printf("ans = " + ans);
    }
}
