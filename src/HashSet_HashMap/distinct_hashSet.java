package HashSet_HashMap;

import java.util.HashSet;

public class distinct_hashSet {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5,5,6,3};
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0; i< arr.length; i++){
          hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }
}
