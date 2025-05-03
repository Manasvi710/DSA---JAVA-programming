package HashSet_HashMap;

import java.util.HashSet;

public class subSetOfAnotherArray_Hashset {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int [] arr1={1,8,5};
        System.out.println(subSet(arr, arr1));
    }
    public static boolean subSet(int [] arr, int [] arr1){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:arr){
            hashSet.add(i);
        }
        for(int i:arr1){
            if(!hashSet.contains(i)){
                return false;
            }
        }
       return true;
    }
}
