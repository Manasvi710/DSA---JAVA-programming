package basicprogram;

public class breakstatement {
    public static void main(String[] args) {
        int i;
        int n=10;
        for(i=1; i<=n; i++)
        {
            if(i==6)
                break;
            System.out.println(i);
        }
    }
}
