package string;

public class remove_duplicate {
    public static void main(String[] args) {
        String s1="hello";
        int [] arr= new int[128];
        String ans=" ";
        for(int i=0; i< s1.length(); i++){
            int asciivalue= s1.charAt(i);
            arr[asciivalue]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==1){
                ans+=arr[i];
                System.out.print((char)i);
            }
        }
    }
}
