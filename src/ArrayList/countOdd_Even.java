package ArrayList;

import java.util.ArrayList;

public class countOdd_Even {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int even=0;
        int odd=0;
        for(int ele : arrayList){
            if(ele%2 == 0){
               even++;
            }else {
                odd++;
            }
        }
        System.out.println("even element :: "+ even);
        System.out.println("odd element :: "+ odd);
    }
}
