package basicprogram;

public class palindrome {
    public static void main(String[] args) {
//        int rev=0,r,original;
//        int n = 52125;
//        original=n;
//        while(n>0)
//        {
//            r=n%10;
//            rev=(rev*10) +r;
//            n=n/10;
//        }
//
//        if(original==rev)
//        {
//            System.out.print("palindorm ");
//        }
//        else {
//            System.out.print("Not palindrome ");
//        }

        int rev=0, r, original;
        int n=52125;
        original=n;
        while(n>0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(original!=rev){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }
}
