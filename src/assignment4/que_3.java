package assignment4;

import java.util.Arrays;

public class que_3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int m=3;
        m=m%n;
        for(int i=0; i<m;i++){
            int temp=arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
