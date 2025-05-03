package patterns;

public class q11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {
            int num=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += i;
            }
            System.out.println();
        }
    }
}
