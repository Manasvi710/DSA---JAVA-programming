package string;

public class equal_digites_chars {
    public static void main(String[] args) {
        String s= "abcd 1234";
        char [] chars=s.toCharArray();
        int digit=0;
        int character=0;
        for(int i=0; i<chars.length; i++){
            if(s.charAt(i) >='0' && s.charAt(i)<='9'){
                digit++;
            }else if(s.charAt(i) == ' '){
                continue;
            }else {
                character++;
            }
        }
        if(digit==character){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
    }
}
