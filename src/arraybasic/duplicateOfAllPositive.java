package arraybasic;

public class duplicateOfAllPositive {
    public static void main(String[] args) {
        int arr[]={2,5,6,2,3,5,2};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1){
                continue;
            }
            int v=arr[i];
            int c=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==v){
                    c++;
                    arr[j]=-1;
                }
            }
            if(c>0){
                System.out.print(v + " ");
            }
        }
    }
}
