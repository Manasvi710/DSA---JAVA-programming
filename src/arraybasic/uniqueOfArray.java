package arraybasic;

public class uniqueOfArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,5,1,5};
        for(int i=0; i<arr.length; i++){
            int v=arr[i];
            int c=0;
            for(int j=0; j< arr.length; j++){
                if(arr[j]==v){
                    c++;
                    if(c>1){
                        break;
                    }
                }
            }
            if(c==1){
                System.out.print(v + " ");
            }
        }
    }
}
