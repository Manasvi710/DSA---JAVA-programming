package practice;

public class practiceBasic {
    public static void main(String[] args) {//      int n=100;
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//        for(int i=n; i>=1; i--){
//            System.out.println(i);
//        }
 //       int i=1;
//        while(i <= 100){
//            System.out.println(i);
//            i++;
//        }
//        int i=100;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//        }
//        int i=5;
//        while(i<=50) {
//            System.out.println(i);
//            i+=5;
//        }
//        for(int i=5; i<=50; i+=5){
//            System.out.println(i);
//        }
//        for(int i=1; i<=99; i+=2){
//            System.out.println(i);
//        }
//        for(int i=2; i<=100; i+=2){
//            System.out.println(i);
//        }
//        int a=20, b=10;
//        System.out.println(a + " " + b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.print(a + " " + b);
//        int d=12354;
//        System.out.println("days = " + d);
//
//        int y=d/365;
//        System.out.println("years = " + y);
//
//        d=d%365;
//        System.out.println("extra days =" + d);
//
//        int m=d/30;
//        System.out.println("months = " + m);
//
//        d=d%30;
//        System.out.println("days = " + d);
//        int s=12342;
//        System.out.println("seconds = " + s);
//
//        int h=s/3600;
//        System.out.println("hours = " + h);
//
//        s=s%3600;
//        System.out.println("extra seconds = " +s);
//
//        int m=s/60;
//        System.out.println("minutes = " +m);
//
//        s=s%60;
//        System.out.println("seconds = "+s);
//        int n=1234;
//        int rev=0, r;
//        while(n>0){
//            r=n%10;
//            rev=rev*10+r;
//            n=n/10;
//        }
//        System.out.print(rev);
//        int n=1234;
//        int c=0;
//        while(n>0){
//            c++;
//            n=n/10;
//        }
//        System.out.print(c);
//        int n=12321;
//        int rev=0,r;
//        int original = n;
//        while(n>0){
//            r=n%10;
//            rev=rev*10+r;
//            n=n/10;
//        }
//        if(original==rev){
//            System.out.println("palindrome number");
//        }else{
//            System.out.println("Not palindrome number");
//        }
//          int n1=12;
//          int n2=3;
//          int ans=0;
//          for(int i=1; i<=n2; i++){
//              ans=ans+n1;
//          }
//        System.out.println(ans);
//        int n1=2;
//        int n2=3;
//        int ans=1;
//        for(int i=1; i<=n2; i++){
//            ans=ans*n1;
//        }
//        System.out.println(ans);
//        int n=11;
//        for(int i=2; i<n;i++){
//            if(n%i==0){
//                System.out.println("Not Prime number");
//                return;
//            }
//        }
//        System.out.println("prime number");
//        int n=5;
//        int ans=1;
//        for(int i=1; i<=n; i++){
//            ans=ans*i;
//        }
//        System.out.println(ans);
//        int n=6;
//        int a=0, b=1;
//        for(int i=1;i<=n;i++){
//            System.out.print(a + " ");
//            int next=a+b;
//            a=b;
//            b=next;
//        }
//        int n=10;
//
//            if(n%2==1){
//                System.out.println(n*2);
//        }else{
//                System.out.println(n);
//            }

//        int n=10;
//        int m=3;
//        int n1=0, n2=0;
//        int ans=0;
//        for(int i=0; i<=n; i++){
//            if(i%m != 0){
//                n1=n1+i;
//            }-g
//        }
//        for(int j=0; j<=n; j++){
//            if(j%m == 0){
//               n2=n2+j;
//            }
//        }
//        ans=n1-n2;
//        System.out.println("ans = "+ans);
//        int n=234,r;
//        int product=1, sum=0;
//        int m=n;
//        while(m>0){
//            r=m%10;
//            product=product*r;
//            sum=sum+r;
//            m=m/10;
//        }
//       int  ans = product-sum;
//        System.out.println(ans);
//        int n=14;
//        int count=0;
//        while(n != 0){
//            if(n%2 == 0){
//                n=n/2;
//            }else{
//                n=n-1;
//            }
//            count++;
//        }
//        System.out.println(count);
//        int left=1,right=22;
//        for(int i=left; i<=right; i++){
//            if(selfdividing(i) == true){
//                System.out.print(i + " ");
//            }
//        }
//    }
//    static boolean selfdividing(int n) {
//        int m = n;
//        while (n>0) {
//            int r = n % 10;
//            if (r == 0 || m % r != 0) {
//                return false;
//            }
//            n = n / 10;
//        }
//        return true;

//        int n=5;
//        int a=1;
//        int b=1;
//        for(int i=0; i< n; i++){
//            System.out.print(a+" ");
//            a=a+b;
//            b++;
//        }
//        int a=10;
//        int b=20;
//        System.out.println(a+ " " +b);
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.print(a + " "+b);
//         int n=101011;
//        System.out.println(binaryNumber(n));
//    }
//    static boolean binaryNumber(int n){
//        while(n>0){
//            int r=n%10;
//            if(r!=1 && r!=0){
//                return false;
//            }
//            n=n/10;
//        }
//        return true;
//        int a=10;
//        int b=20;
//        int ans=0;
//
//        ans=a-(-b);
//        System.out.println(ans);
//        int n=12345;
//        int sum=0;
//        int count=0;
//
//        while (n>0){
//            int r=n%10;
//            sum=sum+r;
//            count++;
//            n=n/10;
//        }
//        System.out.println(sum/count);
        int left=11, right=20;
        for(int i=left; i<=right; i++){
            if(primeNumber(i)==true){
                System.out.print(i + " ");
            }
        }
    }
    static boolean primeNumber(int n){
       int m=n;
        for(int i=2; i<n; i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}
