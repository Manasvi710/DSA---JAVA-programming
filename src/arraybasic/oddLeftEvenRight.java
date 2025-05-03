package arraybasic;

import java.util.Arrays;

public class oddLeftEvenRight {
    public static void main(String[] args) {
        int arr[]={2,9,5,4,6,8,1};
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2 == 0){
                left++;
            }else if(arr[right]%2 ==1){
                right--;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
