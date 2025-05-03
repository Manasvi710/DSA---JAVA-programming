package arraybasic;

import java.util.Arrays;

public class copyArrayInAnotherArray {
    public static void main(String[] args) {
        int arr[]={2,5,0,9,3,8};
        int n=arr.length;
        int[]b=new int[n];
        for(int i=0; i<n; i++){
            b[i]=arr[i];
        }
        System.out.print(Arrays.toString(b));
    }
}
