package string;

public class duplicate_charater_find {
    public static void main(String[] args) {
        String s1="hello";
        int [] arr= new int[128];
        for(int i=0; i< s1.length(); i++){
            int asciivalue= s1.charAt(i);
            arr[asciivalue]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 1){
                System.out.println((char)i);
            }
        }
    }
}
