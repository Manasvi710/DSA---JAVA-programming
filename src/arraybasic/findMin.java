package arraybasic;

public class findMin {
    public static void main(String[] args) {

        int arr[]={83,52,70,92,16};

        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("minimum element = " + min);
    }
}
