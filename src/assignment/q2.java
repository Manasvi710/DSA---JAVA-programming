package assignment;

public class q2 {
    public static void main(String[] args) {
        int i, j;
        int n = 10;
        int m = 3;
        int n1 = 0, n2 = 0;
        int ans = 0;
        for(i = 1; i <= n; i ++)
            if(i%m != 0)
            {
                n1 = n1 + i;
            }
        for(j = 1; j <= n; j++)
            if(j%m == 0)
            {
                n2 = n2+j;
            }
        ans = n1 - n2;
        System.out.printf("n1-n2 = " + ans);
    }
}
