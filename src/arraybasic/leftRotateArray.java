package arraybasic;

import java.util.Arrays;

public class leftRotateArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int m=3;
        m=m%n;
        for(int i=0; i<m; i++){
            int temp=arr[0];
            for(int j=0; j<n-1; j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
