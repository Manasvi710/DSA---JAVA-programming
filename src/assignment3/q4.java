package assignment3;

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
//        int a1[]={1,2,3,4};
//        int a2[]={5,6,7};
//        int arr[]= new int[a1.length+ a2.length];
//        int j=0;
//        for(int i=0; i<a1.length; i++){
//            arr[j]=a1[i];
//            j++;
//        }
//        for(int i=0; i<a2.length; i++){
//            arr[j]=a2[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr));
        int a1[]={0, 7, 1,4};
        int a2[]={10,4,2,6,7};
        int arr[]=new int[a1.length+a2.length];
        int j=0;
        for(int i=0; i<a1.length; i++){
            arr[j]=a1[i];
            j++;
        }
        for(int i=0; i<a2.length; i++){
            arr[j]=a2[i];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
