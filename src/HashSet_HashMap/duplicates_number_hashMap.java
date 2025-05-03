package HashSet_HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class duplicates_number_hashMap {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,3,3,4,5,5};
        duplicate(arr);
    }
    public static void duplicate(int[] arr){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
         for(int i=0; i< arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> me:hashMap.entrySet()){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}
