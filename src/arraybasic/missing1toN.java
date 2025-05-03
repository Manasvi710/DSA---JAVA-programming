package arraybasic;

public class missing1toN {
    public static void main(String[] args) {
        int n=5;
        int arr[]={3,1,2,5};
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0; i<arr.length; i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum-sum2);
    }
}
