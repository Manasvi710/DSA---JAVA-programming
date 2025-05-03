package string;

public class count_Words_withoutSplit {
    public static void main(String[] args) {
        String s="hello World";
        int c=1;
        char [] ch=s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i] == ' '){
                c++;
            }
        }
        System.out.println("count word : " + c);
    }
}

