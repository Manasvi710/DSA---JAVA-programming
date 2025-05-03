package HashSet_HashMap;

import java.util.HashMap;
import java.util.Map;

public class count_frequency_hashMap {
    public static void main(String[] args) {
        int []arr={1,2,1,1,2,3,4,5,5};
        HashMap<Integer , Integer> hashMap=new HashMap<>();
        for(int i=0; i< arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }
        }
        for(Map.Entry me : hashMap.entrySet()) {
                System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
