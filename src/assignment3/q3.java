package assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6};
//        int n=arr.length;
//        int a1[]= new int[n/2];
//        int a2[]= new int[n/2];
//        for(int i=0; i<n/2; i++){
//            a1[i]=arr[i];
//            }
//        int j=0;
//        for(int i=n/2; i<n; i++){
//            a2[j]=arr[i];
//            j++;
//
//        }
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(a2));
        int arr[]={9,2,5,7,3,8,9,0};
        int n= arr.length;
        int a1[]=new int[n/2];
        int a2[]=new int[n/2];
        for(int i=0; i<n/2; i++){
            a1[i]=arr[i];
        }
        int j=0;
        for(int i=n/2; i<n; i++){
            a2[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        }
    }


