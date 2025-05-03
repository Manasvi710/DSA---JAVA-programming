package HashSet_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class  array_equal_or_Not_HashSet {
    public static void main(String[] args) {
        int [] arr1={1,3,3,4,5,5};
        int [] arr2={1,3,4,3,5,5};

        if(arr1.length != arr2.length){
            System.out.println("not euqal");
            return;
        }

        HashMap<Integer, Integer> hashMap=new HashMap<>();
        HashMap<Integer, Integer> hashMap2=new HashMap<>();
        for(int i : arr1) {
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            }else{
                hashMap.put(i, 1);
            }
        }
        for(int i:arr2) {
            if(hashMap2.containsKey(i)){
                hashMap2.put(i, hashMap2.get(i)+1);
            }else{
                hashMap2.put(i, 1);
            }
        }
        System.out.println(hashMap.equals(hashMap2));
    }
}
