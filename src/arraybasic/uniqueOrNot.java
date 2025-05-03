package arraybasic;

public class uniqueOrNot {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int d=1;
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==d) {
                count++;
            }
        }
        if(count < 2){
            System.out.println("unique ");
        }else{
            System.out.println("not unique");
        }
    }
}
