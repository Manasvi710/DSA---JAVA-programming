package assignment;

public class q5 {
    public static void main(String[] args) {

        int left = 47;
        int right = 85;
        for(int i = left; i<= right; i++)
        {
            if(selfdividing(i) == true)
            {
                System.out.print(i + " ");
            }
        }
    }

    static boolean selfdividing(int n) {
        int m = n;
        while(n > 0)
        {
            int r = n%10;
            if(r == 0 || m % r != 0)
            {
                return false;
            }
            n = n/10;
        }
        return true;
    }
}


