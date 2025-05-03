package arraybasic;

import java.util.Arrays;

public class arr0ToRightans1sToLeft {
    public static void main(String[] args) {
        int []arr={0,1,0,1,1,0,0,1,0};
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }else if(arr[right]==1){
                right--;
            }else{
                arr[left]=0;
                arr[right]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
