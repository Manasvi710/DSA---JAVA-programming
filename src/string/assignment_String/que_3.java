package string.assignment_String;

public class que_3 {
    public static void main(String[] args) {
        String str="abac";
        String str2="aabc";
        int [] arr1=countFrequency(str);
        int [] arr2=countFrequency(str2);
        for(int i=0; i<128; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    public static int[] countFrequency(String str){
        int [] arr=new int[128];
        for(int i=0; i<str.length(); i++){
            int asciivalue =str.charAt(i);
            arr[asciivalue]=arr[asciivalue]+1;
        }
        return arr;
    }
}
