package arraybasic;

public class printOddEvene {
    public static void main(String[] args) {
        int arr[]={2,4,7,5,9,0};
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2  != 0){
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2  == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
