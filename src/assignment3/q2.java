package assignment3;

public class q2 {
    public static void main(String[] args) {
//        int arr[] = {4, 3, 6, 7, 21, 11, 15, 5};
//        for(int i=0; i<arr.length; i++){
//        if(PrimeNumber(arr[i])==true){
//            System.out.print(arr[i] + " ");
//            }
//        }
//    }
//    static boolean PrimeNumber(int n) {
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
        int arr[] = {4, 3, 6, 7, 21, 11, 15, 5};
        for (int i = 0; i < arr.length; i++) {
            if (PrimeNumber(arr[i]) == true) {
                System.out.print(arr[i] + " ");
            }
        }
    }
        static boolean PrimeNumber(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
   }
}
