package basicprogram;

public class continuestatement {
    public static void main(String[] args) {
        int i;
        int n=10;
        for(i=1; i<=n; i++)
        {
            if(i==6)
                continue;
            System.out.println(i);
        }
    }
}
