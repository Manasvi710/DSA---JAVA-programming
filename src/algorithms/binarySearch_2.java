package algorithms;

public class binarySearch_2 {
    public static void main(String[] args) {
        int arr[]={9,6,4,0,-3,-8,-9};
        int d=6;
        int start=0, end= arr.length-1;
        while (start <= end){
            int mid= (start+end) /2;
            if(arr[mid]==d){
                System.out.println("present");
                return;
            } else if (arr[mid] > d) {
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        System.out.println("not present");
    }
}
