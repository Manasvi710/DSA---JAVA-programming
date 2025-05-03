package assignment3;

public class q6 {
    public static void main(String[] args) {
//        int a1[]={1,5,7,8,9};
//        int n= a1.length;
//        String ans = null;
//        for(int i=1; i<n; i++){
//            if(a1[i] >= a1[i-1]){
//                ans = "true";
//            }else{
//                ans = "false";
//            }
//        }
//        System.out.println(ans);
        int a1[]={1,5,7,8,9};
        int n= a1.length;
        String ans=null;
        for(int i=1; i<n; i++){
            if (a1[i] >= a1[i-1]) {
                ans="true";
            }else {
                ans ="false";
            }
        }
        System.out.println(ans);
    }
}
