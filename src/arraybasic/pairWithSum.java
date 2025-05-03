package arraybasic;

public class pairWithSum {
    public static void main(String[] args) {
        int arr[]={1,2,9,15,27,30};
        int sum=39;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println("present");
                return;
            }
            else if(arr[i]+arr[j]<sum){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("not present");
    }
}
