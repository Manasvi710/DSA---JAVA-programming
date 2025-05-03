package string;

public class reverse_intenally_word {
    public static void main(String[] args) {
//        String s1="hello World";
//        String [] arr= s1.split(" ");
//        String s2=" ";
//        for(int i=0; i<arr.length; i++){
//            char [] chars=arr[i].toCharArray();
//            for(int j=chars.length-1; j>=0; j--){
//                s2=s2+chars[j];
//            }
//        }
//        System.out.print(s2 + " ");

        String s="hello world good morning";
        String [] s1=s.split(" ");
        String s2="";
        for(int i=0; i<s1.length; i++){
            char [] ch=s1[i].toCharArray();
            for(int j=ch.length-1; j>=0; j--){
                s2=s2+ch[j];
            }
            s2=s2 +" ";
        }
        System.out.println(s2);
    }
}
