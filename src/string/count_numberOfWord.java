package string;

public class count_numberOfWord {
    public static void main(String[] args) {
        String s="hello world";
        int c=0;
        String[] arr=s.split(" ");

        for(int i=0; i<arr.length; i++){
            c++;
        }
        System.out.println("Count Word " + c);

    }
}
