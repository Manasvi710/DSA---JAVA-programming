package string;

public class all_string_palindrome {
    public static void main(String[] args) {
        String s=" madam oko nitin";
        String [] s1=s.split(" ");

        for(int i=0; i< s1.length; i++) {
            String original = s1[i];
            char[] ch = s1[i].toCharArray();
            String reverse = "";
            for(int j=ch.length-1; j>=0; j--){
                reverse=reverse+ch[j];
            }
            if(!reverse.equals(original)){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
