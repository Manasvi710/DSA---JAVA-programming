package arraybasic;

public class alternateElementLast {
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9,0};
                for(int i=arr.length-1; i>=0; i-=2){
                    System.out.println(arr[i]);
                }
    }
}
