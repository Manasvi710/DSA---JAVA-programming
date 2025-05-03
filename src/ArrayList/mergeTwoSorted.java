package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class mergeTwoSorted {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer>arrayList2= new ArrayList<>();
        ArrayList<Integer>arrayList3=new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList2.add(8);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);

        arrayList3.addAll(arrayList1);
        arrayList3.addAll(arrayList2);

       /* int n1=arrayList1.size();
        int n2=arrayList2.size();

        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            if(arrayList1.get(i)<arrayList2.get(j)){
                arrayList3.add(arrayList1.get(i));
                i++;
            }else {
                arrayList2.get(j);
                j++;
            }
        }
      while (i<n1){
          arrayList3.add(arrayList1.get(i));
          i++;
      }
      while (j<n2){
          arrayList3.add(arrayList2.get(j));
          j++;
      }*/
        Collections.sort(arrayList3);

        System.out.println(arrayList3);
    }
}
