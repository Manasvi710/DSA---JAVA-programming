package Recursion;

public class printArray_withoutLoop {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        printArray(arr, 0);
    }
    public static void printArray(int [] arr, int Index){
        if(Index < arr.length){
            System.out.println(arr[Index]);
            printArray(arr, Index+1);
        }
    }
}
