package basicprogram;

public class returnstatement {
    public static void main(String[] args) {
        int i;
        int n=10;
        for(i=1; i<=n; i++)
        {
            if(i==6)
                return;
            System.out.println(i);
        }
    }
}
