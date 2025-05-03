package HashSet_HashMap;

import java.util.HashMap;
import java.util.Map;

public class most_frequency_hashMap {
    public static void main(String[] args) {
        int [] arr={1,2,2,2,1,4,5,5};
        System.out.println(mostFrequency(arr));
    }
    public static int mostFrequency(int [] arr){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int i: arr){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else{
                hashMap.put(i, 0);
            }
        }
        int mostfrequency=-1;
        int maxfrequency=-1;
        for(Map.Entry<Integer, Integer> me:hashMap.entrySet()){
            int fre=me.getValue();
            if(fre>maxfrequency){
                mostfrequency= me.getKey();
                maxfrequency=fre;
            }
        }
        return mostfrequency;
    }
}
