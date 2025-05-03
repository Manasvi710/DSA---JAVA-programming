package arraybasic;

import java.util.Arrays;

public class smallerThanCurrent {
    public static void main(String[] args) {
        int[]arr={2,5,0,9,3,8,9};
        int n=arr.length;
        int b[]=new int[n];
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
            if(arr[j] < arr[i]) {
                count++;
               }
            }
            b[i]=count;
        }
        System.out.print(Arrays.toString(b));
    }
}
