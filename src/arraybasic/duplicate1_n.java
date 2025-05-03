package arraybasic;

public class duplicate1_n {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,4,2,5,3,2};
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0; i<arr.length; i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum2-sum);
    }
}
