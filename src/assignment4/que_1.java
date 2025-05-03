package assignment4;

public class que_1 {
    public static void main(String[] args) {
        int arr[]={2,7,3,60,10,22};
        int sum=8;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}
