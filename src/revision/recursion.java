package revision;

public class recursion {
    public static void main(String[] args) {
       int n=5;
       int [] arr={1,2,6,4,5};
       int n1=3;
       int n2=3;
//        System.out.println(fact(5));
//        System.out.println(sum(6));
//        System.out.println(reverse(n, 0));
//        System.out.println(sumOfdigit(n));
//        printArray(arr, 0);
//        System.out.println(count(n));
//        System.out.println(product(n1, n2));
//        System.out.println(Max_element(arr, 0));
//        if(prime(n, 2)){
//            System.out.println("prime");
//            return;
//        }
//        System.out.println("not prime");
        System.out.println(fibonacci(n));
    }
    public static void print(){
        System.out.println("hello");
        print();
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n+fact(n-1);
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+fact(n-1);
    }
    public static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10, rev*10 + n%10);
    }

    public static int sumOfdigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfdigit(n/10);
    }

    public static void printArray(int [] arr, int Index){
        if(Index < arr.length){
            System.out.print(arr[Index] + " ");
            printArray(arr, Index+1);
        }
    }

    public static int count(int n){
        if(n==1){
            return 1;
        }
        return 1+count(n/10);
    }

    public static int product(int n1, int n2){
        if(n1==0 || n2 ==0){
            return 0;
        }
        return n1+product(n1,n2-1);
    }

    public static int Max_element(int [] arr, int Index){
        if(Index ==arr.length-1){
            return arr[Index];
        }
        int max=Max_element(arr, Index+1);
        return Math.max(arr[Index], max);
    }

    public static boolean prime(int n, int d){
        if(n<=1){
            return false;
        }
        if(n==d){
            return true;
        }
        if(n%d == 0){
            return false;
        }
        return prime(n, d+1);
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }

}
