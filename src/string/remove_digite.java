package string;

public class remove_digite {
    public static void main(String[] args) {
        String s="hello123";
        String s1=" ";
        char [] chars=s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] >= '0' && chars[i] <='9'){
                continue;
            }else {
                s1=s1+chars[i];
            }
        }
        System.out.println(s1);
    }
}
