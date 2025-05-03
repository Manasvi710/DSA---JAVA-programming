package HashSet_HashMap;

import java.util.HashSet;

public class pair_sum_unshorted_hashSet {
    public static void main(String[] args) {
        int [] arr={4,2,7,5,9};
        int sum=16;
        System.out.println(sum(arr,sum));
    }
    public static boolean sum(int [] arr, int sum){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            int sub=sum-arr[i];
            if(hashSet.contains(sub)){
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }
}
