package assignment4;

public class que_2 {
    public static void main(String[] args) {
        int arr[]={1,3,7,11,14,16,20};
        int sum=50;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if (arr[i]+arr[j]==sum) {
                System.out.println("present");
                return;
            }
            i++;
            j--;
        }
        System.out.println("not present");
    }
}
