package practice;

public class stringBuilder {
    public static void main(String[] args) {
        String str="hello";
        StringBuilder sb=new StringBuilder("abc");
        StringBuilder sb1=new StringBuilder(str);
        System.out.println(sb1);
        System.out.println(sb1.length());

        sb1.append("abc");
        System.out.println(sb1);
        sb1.append("def");
        System.out.println(sb1);

        sb.insert(0, 'z');
        System.out.println(sb);

        sb.insert(sb.length(),'x');
        System.out.println(sb);

        sb.setCharAt(2, 'q');
        System.out.println(sb);

        String str1=sb.toString();
    }
}
