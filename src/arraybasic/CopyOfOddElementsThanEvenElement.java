package arraybasic;

import java.util.Arrays;

public class CopyOfOddElementsThanEvenElement {
    public static void main(String[] args) {
        int arr[]={2,5,0,9,3,8};
        int n=arr.length;
        int[]b=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                b[j]=arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                b[j]=arr[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(b));

    }
}
