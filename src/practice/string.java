package practice;

public class string {
    public static void main(String[] args) {
//        String s1="hello";
//        System.out.println(s1);
//        for(int i=s1.length()-1; i>=0; i--){
//            System.out.print(s1.charAt(i));
//        }

//        String s="manasvi";
//        char [] arr=s.toCharArray();
//        int i=0;
//        int j=s.length()-1;
//        while(i<j){
//            char temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(arr);

//        String str="madam";
//        if(ispalindrome(str)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//    }
//    public static boolean ispalindrome(String str){
//        int i=0;
//        int j=str.length()-1;
//        while (i<j){
//            if(str.charAt(i) != str.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;

//        String s="hello world";
//        String[] arr=s.split(" ");
//        int c=0;
//        for(int i=0; i<arr.length; i++){
//            c++;
//        }
//        System.out.println(c);

//        int c=1;
//        char[] ch=s.toCharArray();
//        for(int i=0; i<s.length(); i++){
//            if(ch[i] == ' '){
//                c++;
//            }
//        }
//        System.out.println(c);

//        String s1= "hello";
//        String s2="hello";
//        if(isSame(s1,s2)){
//            System.out.println("String are same");
//        }else{
//            System.out.println("string are not same");
//        }
//    }
//    public static boolean isSame(String s1, String s2){
//        if(s1.length() != s2.length()){
//            return false;
//        }
//        for(int i=0; i<s1.length(); i++){
//            if(s1.charAt(i) != s2.charAt(i)){
//
//                return false;
//            }
//        }
//
//        return true;

//        String s="hello world";
//        char [] ch=s.toCharArray();
//        for(int i=0; i<s.length(); i++){
//            if(ch[i] == 'l'){
//                ch[i]='r';
//            }
//        }
//        String update=new String(ch);
//        System.out.println(update);

//        String s="hello";
//        char [] ch=s.toCharArray();
//
//        for(int i=0; i<s.length()-1; i++){
//            for(int j=0; j<s.length()-i-1; j++){
//                if(ch[j] > ch[j+1]){
//                    char temp=ch[j];
//                    ch[j]=ch[j+1];
//                    ch[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(ch);

//        String s="hello";
//        char [] ch=s.toCharArray();
//        for(int i=0; i<s.length(); i++){
//            char c='1';
//            if(ch[i] == '1'){
//                continue;
//            }
//            for(int j=i+1; j<s.length(); j++){
//                if(ch[j]==ch[i]){
//                    ch[j]='1';
//                    c++;
//                }
//            }
//            System.out.println(ch[i] + " " + c);
//        }

//        String s="hello world";
//        String s1=" ";
//        char [] ch=s.toCharArray();
//        for(int i=0; i<s.length(); i++){
//            if(ch[i] != 'a' &&  ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' &&
//                    ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U'){
//                s1=s1+s.charAt(i);
//            }
//        }
//        System.out.println(s1);

//        String s="hello world";
//        String [] arr=s.split(" ");
//        String s2=" ";
//        for(int i=0; i<arr.length; i++){
//            char [] ch=arr[i].toCharArray();
//            for(int j=ch.length-1; j>=0; j--){
//                s2=s2+ch[j];
//            }
//        }
//        System.out.println(s2 + " ");

//        String s="hello";
//        int [] arr=new int[128];
//        for(int i=0; i<s.length(); i++){
//            int asciivalue=s.charAt(i);
//            arr[asciivalue]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > 1){
//                System.out.println((char)i);
//            }
//        }

//        String s="hello1234";
//        String s1=" ";
//        char [] ch=s.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            if(ch[i] > '0' && ch[i] <='9'){
//                continue;
//            }else {
//                s1+=ch[i];
//            }
//        }
//        System.out.println(s1);

//        String s1="abcd";
//        String s2="wxyz";
//        char [] ch=s1.toCharArray();
//        char [] ch1=s2.toCharArray();
//        char [] ch2=new char[s1.length() + s2.length()];
//        for(int i=0; i<ch2.length; i+=2){
//            ch2[i]=ch[i/2];
//        }
//        for(int i=1; i<ch2.length; i+=2){
//            ch2[i]=ch1[i/2];
//        }
//        String s3=new String(ch2);
//        System.out.println(s3);

//        String s="madam oko nitin";
//        String [] s1=s.split(" ");
//
//        for(int i=0; i<s1.length; i++){
//            String original=s1[i];
//            char [] ch=s1[i].toCharArray();
//            String reverse=" ";
//            for(int j=ch.length-1; j>=0; j--){
//                reverse+=ch[j];
//            }
//            if(!reverse.equals(original)){
//                System.out.println("not palindrome");
//                return;
//            }
//        }
//        System.out.println("palindrome");

//        String s="abcd1234";
//        char []ch=s.toCharArray();
//        int digit=0;
//        int character=0;
//        for(int i=0; i<ch.length; i++){
//            if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
//                digit++;
//            }else if(s.charAt(i) == ' '){
//                continue;
//            }else {
//                character++;
//            }
//        }
//        if(digit==character){
//            System.out.println("same");
//        }else{
//            System.out.println("not same");
//        }
    }
}
