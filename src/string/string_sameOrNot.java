package string;

public class string_sameOrNot {
    public static void main(String[] args) {
        String s1= "hello";
        String s2="hello";
        if(isSame(s1, s2) == true){
            System.out.println("String are same");
        }else{
            System.out.println("string are not same");
        }
    }
    public static boolean isSame(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
//String s3=new String("hello");
//        String s4=new String("hello");
//        System.out.println(s1 == s3);
//        System.out.println(s3.equals(s4));