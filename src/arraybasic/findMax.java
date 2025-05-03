package arraybasic;

public class findMax {
    public static void main(String[] args) {
        int arr[]={2,5,7,9,3,1};
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element = " +max);

        int arr1[]={-2,-3,-5,-8,-4};
        int max1=Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>max1){
                max1=arr1[i];
            }
        }
        System.out.println("maximum element = "+max1);

     }
}
