package arraybasic;

public class find2ndMin {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,9,1};
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<min){
                min2=min;
                min=arr[i];
            }else if(arr[i]<min && arr[i] != min){
                min2=arr[i];
            }
        }
        System.out.print(min2);
    }
}
