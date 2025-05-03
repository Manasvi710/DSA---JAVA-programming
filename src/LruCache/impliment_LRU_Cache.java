package LruCache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class impliment_LRU_Cache {
    public static void main(String[] args) {
        lru c=new lru();
        c.put(1, "abc");
        c.put(2, "xyz");
        c.put(3, "mvk");
        System.out.println(lru.q);
        c.get(2);
        System.out.println(lru.q);
        c.put(4, "lvm");
        System.out.println(lru.q);
    }
}
class cache{
    int key;
    String value;

    public cache(int key, String value) {
        this.key = key;
        this.value=value;
    }
}
class lru{
    static Deque<Integer> q=new LinkedList<>();
    static HashMap<Integer, cache> map=new HashMap<>();
    int capacity=3;
    void put(int key, String val){
        if(map.containsKey(key)){
            cache curr=map.get(key);
            q.remove(curr.key);
        }else{
            if(q.size() == capacity){
                int temp=q.removeLast();
                map.remove(temp);
            }
        }
        cache newItem=new cache(key, val);
        q.addFirst(newItem.key);
        map.put(key, newItem);
    }
    String get(int key){
        if(map.containsKey(key)){
            cache curr=map.get(key);
            q.remove(curr.key);
            q.addFirst(curr.key);
            return curr.value;
        }
        return "not exist";
    }
}