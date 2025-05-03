package algorithms;

public class binarySearch_1 {
    public static void main(String[] args) {
        int arr[]={-5,-3,-2,0,2,3,6,9};
        int d=-5;
        int start=0, end=arr.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(arr[mid]==d){
                System.out.println("present");
                return;
            } else if (arr[mid] < d) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        System.out.println("not present");
    }
}
