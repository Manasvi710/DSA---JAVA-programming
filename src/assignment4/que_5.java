package assignment4;

import java.util.Arrays;

public class que_5 {
    public static void main(String[] args) {
        int arr[]={5,3,10,9,6,13};
        for(int i=0; i<arr.length; i++){
            int m=-1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    m=arr[j];
                    break;
                }
            }
            System.out.print(m + " ");
        }
    }
}
