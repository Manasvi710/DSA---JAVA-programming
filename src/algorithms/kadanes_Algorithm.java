package algorithms;

public class kadanes_Algorithm {
    public static void main(String[] args) {
        // largest contiguous sum

        int arr[]={1,-2,1,4,-6,5,0};
        int n=arr.length;
        int maxsum=0;
        int cursum=0;
        for(int i=0; i<n; i++){
            cursum+=arr[i];
            if(cursum > maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        System.out.print(maxsum);
    }
}
