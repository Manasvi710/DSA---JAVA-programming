package string.assignment_String;

public class que_2 {
    public static void main(String[] args) {
        String s="123";
        int i=0;
        int result=0;
        while (i<s.length()){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int digit=ch-'0';
                result=(result*10) +digit;
            }
            i++;
        }
        int a=result;
        System.out.println(a);
    }
}
