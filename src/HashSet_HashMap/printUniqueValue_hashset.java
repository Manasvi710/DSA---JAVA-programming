package HashSet_HashMap;

import java.util.HashSet;

public class printUniqueValue_hashset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7,7};
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                duplicate.add(arr[i]);
            } else {
                hashSet.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!duplicate.contains(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
