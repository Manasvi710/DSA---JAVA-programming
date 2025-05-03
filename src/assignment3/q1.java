package assignment3;

public class q1 {
    public static void main(String[] args) {
        int arr[]={1,12,6,31,7,9,3,5,0};
        int n= arr.length;
        int d=3;
        for(int i=0; i<n; i++){
            if(arr[i] != 0 && arr[i]%d == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
