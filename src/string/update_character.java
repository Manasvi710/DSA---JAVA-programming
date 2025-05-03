package string;

public class update_character {
    public static void main(String[] args) {
        String s="hello World";
        char[] array=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(array[i] == 'l'){
                array[i]='r';
            }
        }
       String update=new String(array);
        System.out.println(update);
    }
}
