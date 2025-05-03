package Recursion;

public class max_element {
    public static void main(String[] args) {
        int [] arr={2,7,8,5,6};
        System.out.println(Max(arr,0));
    }
    public static int Max(int [] arr, int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int max=Max(arr, index+1);
        return Math.max(arr[index], max);
    }
}
