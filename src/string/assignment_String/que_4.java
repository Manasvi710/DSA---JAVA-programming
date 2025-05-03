package string.assignment_String;

public class que_4 {
    public static void main(String[] args) {
        String s ="PROGRAM";
        char [] chars=s.toCharArray();
        for(int i=0; i<chars.length; i++){
            for(int j=0; j<i; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
