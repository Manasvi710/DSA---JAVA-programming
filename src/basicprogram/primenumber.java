package basicprogram;

public class primenumber {
    public static void main(String[] args) {
//        int i;
//        int n=11;
//        for(i=2; i<n; i++)
//        {
//            if(n%i==0)
//            {
//                System.out.println("not prime number");
//                return;
//            }
//        }
//        System.out.println("prime numebr");

//        int n=11;
//        for(int i=2; i<n; i++){
//            if(n%i==0){
//                System.out.println("not prime");
//            }
//        }
//        System.out.println("prime");
        int num = 2;

       if(isPrime(num) == true){
           System.out.println("prime");
       }else{
           System.out.println("Not prime");
       }
    }
    public static boolean isPrime(int num){
        for(int i=2; i<= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
