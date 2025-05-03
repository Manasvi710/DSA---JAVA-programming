package assignment4;

public class que_7 {
    public static void main(String[] args) {
        int arr[]={1,3,3,7,4,3,2,3,3,2,7,7};
        int a=0;
        int ans=1;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==-1){
                continue;
            }
            int c=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==arr[i]) {
                    c++;
                    arr[j] = -1;
                }
            }
            if(c>a){
                a=c;
                ans=arr[i];
            }
        }
        System.out.print(ans + " ");
    }
}
