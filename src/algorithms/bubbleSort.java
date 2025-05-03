package algorithms;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={8,5,4,6,2,3,7,1};
        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        for(int i =0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
