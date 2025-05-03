package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class que_3_sort_maxnumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(6);
        arrayList.add(28);
        arrayList.add(2);
        arrayList.add(15);

        Collections.sort(arrayList, new SortNumber());

        System.out.println(arrayList);
    }
}
class SortNumber implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1=String.valueOf(o1) + String.valueOf(o2);
        String s2=String.valueOf(o2) + String.valueOf(o2);

        return s2.compareTo(s1);
    }
}