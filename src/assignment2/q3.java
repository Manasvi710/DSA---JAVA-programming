package assignment2;

public class q3 {
    public static void main(String[] args) {
       int n =101011;
        System.out.println(binaryNumber(n));
    }
   static boolean binaryNumber(int n){

        while(n>0){
            int r = n%10;
            if(r!=0 && r!=1){
                return false;
            }
           n = n/10;
        }
       return true;
   }
}
