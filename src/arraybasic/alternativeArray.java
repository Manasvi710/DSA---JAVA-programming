package arraybasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class alternativeArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int arr3[]=new int[arr1.length+arr2.length];

        for(int i=0; i<arr3.length; i+=2){
                arr3[i] = arr1[i/2];
        }
        for(int i=1; i<arr3.length; i+=2){
               arr3[i]=arr2[i/2];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
