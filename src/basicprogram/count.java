package basicprogram;

public class count {
    public static void main(String[] args) {
        int c=0;
        int n=234567;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println(c);
    }
}
