package arraybasic;

public class findSecondMax {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,9};
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
