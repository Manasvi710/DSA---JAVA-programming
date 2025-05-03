package arraybasic;

public class countOddEvenElement {
    public static void main(String[] args) {

//        int[] arr={2,8,5,12,9};
//        int e=0, o=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2==0){
//                e++;
//            }else{
//                o++;
//            }
//        }
//        System.out.println("even = " + e);
//        System.out.println("odd = " + o);
        int arr[]={2,3,4,5,7};
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even = "+even);
        System.out.println("odd = "+odd);
    }
}
