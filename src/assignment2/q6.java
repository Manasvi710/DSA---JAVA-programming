package assignment2;

public class q6 {
    public static void main(String[] args) {
        int left = 11, right= 20;
        for(int i=left; i<=right; i++){
            if(primenumber(i)==true){
                System.out.println(i);
            }
        }
    }
    static boolean primenumber(int n){
        int m=n;
        for(int i=2; i<n; i++){
            if(m%i == 0){
                return false;
            }
        }
        return true;
    }

}