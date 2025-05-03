package assignment4;

public class que_6 {
    public static void main(String[] args) {
         int arr[]={2,7,4,7,8,3,4,8,9,9};
         int a=0;
         for(int i=0; i<arr.length; i++){
             if(arr[i]==-1){
                 continue;
             }
             int c=0;
             for(int j=i+1; j<arr.length; j++){
                 if(arr[j]==arr[i]){
                     c++;
                     arr[j]=-1;
                 }
             }
             if(c>0){
                 System.out.print(arr[i] + " ");
                 a++;
             }
             if(a==2){
                 return;
             }
         }
    }
}
