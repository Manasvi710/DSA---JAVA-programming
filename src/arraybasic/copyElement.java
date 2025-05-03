package arraybasic;

import java.util.Arrays;

public class copyElement {
    public static void main(String[] args) {
        int[]arr={2,5,6,8,4};
        int[] arr1=new int[arr.length*2];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            arr1[j] = arr[i];
            j++;
        }
            for(int i=0; i<arr.length; i++){
                arr1[j]=arr[i];
                j++;
            }
//        System.out.println(Arrays.toString(arr1));

        }
    }

