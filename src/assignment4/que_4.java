package assignment4;

public class que_4 {
    public static void main(String[] args) {
        int arr[]={7,10,17,22,40,1,3,5};
        int value=3;
        int start= arr.length/2+1;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==value){
                System.out.println("present");
                return;
            }else if(arr[mid]<value){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("not present");
    }
}
