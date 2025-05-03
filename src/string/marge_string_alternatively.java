package string;

public class marge_string_alternatively {
    public static void main(String[] args) {
        String s="abcd";
        String s1="wxyz";

        char [] arr=s.toCharArray();
        char [] arr1=s1.toCharArray();
        char [] arr3=new char[s.length()+s1.length()];

        for(int i=0; i<arr3.length; i+=2){
            arr3[i]=arr[i/2];
        }
        for(int i=1; i<arr3.length; i+=2){
            arr3[i]=arr1[i/2];
        }
        String s2=new String(arr3);
        System.out.print(s2);
    }
}
