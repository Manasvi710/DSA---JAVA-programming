package ArrayList;

import java.util.ArrayList;

public class sum_presentOrNot {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(18);
        int sum=21;
        int left=0;
        int right=arrayList.size()-1;

        while (left<right){
            if(arrayList.get(left)+arrayList.get(right)==sum){
                System.out.println("present");
                return;
            }
            else if(arrayList.get(left)+arrayList.get(right)<sum){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("not present");
    }
}
