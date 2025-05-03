package ArrayList;

import java.util.ArrayList;

public class find_Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(6);
        arrayList.add(15);
        arrayList.add(0);
        int max=0;
        for(int i=0;i<arrayList.size();i++)
        {
          if(max<arrayList.get(i)) {
              max=arrayList.get(i);
          }
        }
        System.out.println(max);
    }
}
