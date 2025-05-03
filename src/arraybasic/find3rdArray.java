package arraybasic;

public class find3rdArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,12,15,20};
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max3=max2;
                max2=max;
                max=arr[i];
            }else if(arr[i]>max3 && arr[i]!=max2 && arr[i]!=max){
                max3=arr[i];
            }
        }
        System.out.println(max3);
    }
}
