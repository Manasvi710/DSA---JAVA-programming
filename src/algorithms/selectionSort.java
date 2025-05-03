package algorithms;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={4,7,8,2,1,5,3,6};
        int n= arr.length;
//        for(int i=0; i<n-1; i++){
//            int minIndex=i;
//            for(int j=i+1; j<n; j++){
//                if(arr[j]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            if(i!=minIndex){
//                int temp=arr[i];
//                arr[i]=arr[minIndex];
//                arr[minIndex]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n-1; i++){
            int minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            if(i != minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
