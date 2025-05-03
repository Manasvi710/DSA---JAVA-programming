package arraybasic;

public class sumArrayelement {
    public static void main(String[] args) {
//        int [] arr={12,5,4,7,8};
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//            }
//        System.out.println(sum);
//    }
        int arr[]={1,2,3,4,5};
        int sum=0;
        int mul=1;
        int sub=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            mul=mul*arr[i];
            sub=sub-arr[i];
        }
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(sub);
    }
}
