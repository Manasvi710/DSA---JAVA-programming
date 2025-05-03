package string;

public class palindrome_string {
    public static void main(String[] args) {
        String str="manam";
        if(ispalindrome(str)) {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
//    public static boolean ispalindrome(String str){
//        int i=0;
//        int j=str.length()-1;
//        while (i<j){
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
