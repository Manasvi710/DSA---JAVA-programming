package arraybasic;

public class elementPresent {

    public static void main(String[] args) {
//        if(presentElement()==true){
//            System.out.println("present");
//        }else{
//            System.out.println("not present");
//        }
//
//    }
//    static boolean presentElement(){
//        int[] arr = {12, 5, 7, 10, 8};
//        int a = 3;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == a) {
//                return true;
//            }
//        }
//        return false;
//    }
            int []arr={2,4,5,6,7};
            int n=8;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == n){
                    System.out.println("present");
                    return;
                }
            }
        System.out.println("not present");
    }
}

