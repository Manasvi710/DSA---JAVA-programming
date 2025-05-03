package string;

public class remove_Vowels {
    public static void main(String[] args) {
        String s="hello World";
        String s1=" ";
        char [] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' ||
                    arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U'){
               s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
