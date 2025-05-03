package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hashmap_hashset {
    public static void main(String[] args) {
//        int [] arr={1,2,4,5,3,6,2,1,4};
//        HashSet<Integer> hashSet=new HashSet<>();
//        for(int i=0; i<arr.length; i++){
//            hashSet.add(arr[i]);
//        }
//        System.out.println(hashSet);

//        int [] arr={1,4,3,3,2,1,5,6,7};
//        HashSet<Integer> hashSet=new HashSet<>();
//        HashSet<Integer> duplicate=new HashSet<>();
//        for(int i=0; i<arr.length; i++){
//            if(hashSet.contains(arr[i])){
//                duplicate.add(arr[i]);
//            }else{
//                hashSet.add(arr[i]);
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(!duplicate.contains(arr[i])){
//                System.out.print(arr[i] + " ");
//            }
//        }

//        int [] arr={1,2,3,4,5,6};
//        int [] arr1={1,2,3};
//        System.out.println(IsSubset(arr, arr1));
//    }
//    public static boolean IsSubset(int [] arr, int [] arr1){
//        HashSet<Integer> hashSet=new HashSet<>();
//        for(int i: arr){
//            hashSet.add(i);
//        }
//        for(int i : arr1){
//            if(!hashSet.contains(i)){
//                return false;
//            }
//        }
//        return true;

//        int [] arr={1,1,2,3,4,2,3,5,6,2};
//        HashMap<Integer, Integer> hashMap=new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            if(hashMap.containsKey(arr[i])){
//                hashMap.put(arr[i], hashMap.get(arr[i])+1);
//            }else {
//                hashMap.put(arr[i], 1);
//            }
//        }
//        for(Map.Entry me: hashMap.entrySet()){
//            System.out.println(me.getKey() + ":" + me.getValue());
//        }

//        int [] arr={2,3,5,4,6,1};
//        int sum=19;
//        System.out.println(Sum(arr,sum));
//    }
//    public static boolean Sum(int [] arr, int sum){
//        HashSet<Integer> hashSet=new HashSet<>();
//        for(int i=0; i<arr.length; i++) {
//            int sub = sum - arr[i];
//            if(hashSet.contains(sub)){
//                return true;
//            }
//            hashSet.add(arr[i]);
//        }
//        return false;

//        int [] arr={1,2,3,3,3,4,5,1};
//        System.out.println(mostFrequency(arr));
//    }
//    public static int mostFrequency(int [] arr){
//        HashMap<Integer, Integer> hashMap=new HashMap<>();
//        for(int i:arr){
//            if(hashMap.containsKey(arr[i])){
//                hashMap.put(arr[i] , hashMap.get(arr[i])+1);
//            }else{
//                hashMap.put(i, 0);
//            }
//        }
//        int mostfre=arr[0];
//        int maxfre=0;
//        for(Map.Entry<Integer, Integer> me: hashMap.entrySet()){
//           int fre=me.getValue();
//           if(fre>maxfre){
//               mostfre=me.getKey();
//               maxfre=fre;
//           }
//        }
//        return mostfre;

//        int [] arr1={1,2,3,4,5};
//        int [] arr2={2,3,6,4,5};
//        System.out.println(equal(arr1, arr2));
//    }
//    public static boolean equal(int [] arr1, int [] arr2){
//        HashSet<Integer> hashSet=new HashSet<>();
//        if(arr1.length != arr2.length){
//            return false;
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        for(int i=0; i<arr1.length; i++){
//            if(arr1[i] != arr2[i]){
//                return false;
//            }
//        }
//        return true;

        int [] arr={1,2,2,4,3,1,5};
        duplicate(arr);
    }
    public static void duplicate(int [] arr){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i] , hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> me: hashMap.entrySet()){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}
