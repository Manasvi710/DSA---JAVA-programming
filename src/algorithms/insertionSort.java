package algorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,1,4,7,3};
        int n=arr.length;
        for(int i=1; i<n;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
