package revision;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AllRevision {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter size -- ");
//        int n= scanner.nextInt();
//        int []arr=new int[n];
//        System.out.println("enter value --");
//        for(int i=0; i<n; i++){
//            arr[i]=scanner.nextInt();
//        }
//        int odd=0;
//        int even=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2==1){
//                odd++;
//            }else {
//                even++;
//            }
//        }
//        System.out.println("odd : "+odd);
//        System.out.println("even : "+even);

//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+ " ");
//        }

//        int n=123456;
//        int rev=0, r;
//        while (n > 0){
//            r=n%10;
//            rev=(rev*10)+r;
//            n=n/10;
//        }
//        System.out.print(rev);


//        int [] arr={1,2,3,4,5,6};
//        for(int i=0; i<arr.length; i+=2){
//            System.out.print(arr[i]+ " ");
//        }
//        for(int i=1; i<arr.length; i+=2){
//            System.out.print(arr[i]+ " ");
//        }
//        for(int i=arr.length-1; i>=0; i-=2){
//            System.out.print(arr[i]+ " ");
//        }

//        int [] arr1={1,2,3};
//        int [] arr2={4,5,6};
//        int [] arr3=new int[arr1.length+arr2.length];
//
//        for(int i=0; i<arr3.length; i+=2){
//            arr3[i] = arr1[i/2];
//        }
//        for(int i=1; i<arr3.length; i+=2){
//            arr3[i]=arr2[i/2];
//        }
//        System.out.println(Arrays.toString(arr3));

//        int [] arr={1,0,0,1,1,1,0};
//        int n=arr.length;
//        int i=0;
//        int j=n-1;
//        while (i<j){
//            if(arr[i]==1){
//                i++;
//            }else if(arr[j]==0){
//                j--;
//            }else {
//                arr[i]=1;
//                arr[j]=0;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,2,3,4,5};
//        int i=0;
//        int j=arr.length-1;
//        while (i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={2,4,6,3,7};
//        int sum=0;
//        double avg=0;
//
//        for (int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//            avg=sum/arr.length;
//        }
//        System.out.println(avg);

//        int [] arr={1,2,3,4,5,6};
//        int [] arr1={1,2,3};
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr1.length; j++){
//                if(arr[i]==arr1[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }

//        int [] arr={1,2,3,4,5};
//        int [] a=new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            a[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(a));

//        int [] arr={1,2,3,4,5,6};
//        int [] b=new int[arr.length];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 1){
//                b[j]=arr[i];
//                j++;
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                b[j]=arr[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(b));

//        int n=5;
//        int[] arr={1,2,3,4,5,6};
//        int sum=n*(n+1)/2;
//        int sum2=0;
//        for(int i=0; i<arr.length; i++){
//            sum2=sum2+arr[i];
//        }
//        System.out.println(sum2-sum);

//        int [] arr={1,2,3,1,1,2,4};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int v=arr[i];
//            int count=0;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j]==v){
//                    count++;
//                    arr[j]=-1;
//                }
//            }
//            if(count>0){
//                System.out.print(v + " ");
//            }
//        }

//        int [] arr={1,2,3,4,5,4};
//        int n=2;
//        int count =0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//                count++;
//            }
//        }
//        if(count>=2){
//            System.out.println("duplicate");
//        }else {
//            System.out.println("Not duplicate");
//        }


//       if(isPresent()==true){
//           System.out.println("present");
//       }else {
//           System.out.println("not present");
//       }
//    }
//    public static boolean isPresent(){
//        int [] arr={1,2,3,4,5};
//        int n=7;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//                return true;
//            }
//        }
//        return false;

//        int [] arr={1,2,5,8,6,9};
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

//        int [] arr={2,4,9,8,5,1,10};
//        int max=Integer.MIN_VALUE;
//        int max1=Integer.MIN_VALUE;
//        int max3=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max3){
//                max3=max1;
//                max1=max;
//                max=arr[i];
//            }else if(max3>arr[i]&&max1!=arr[i]&& max!=arr[i]){
//                max3=arr[i];
//            }
//        }
//        System.out.println(max3);

//        int [] arr={4,9,8,1,0};
//        int min=Integer.MAX_VALUE;
//        int min1=Integer.MIN_VALUE;
//        int min2=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<min){
//                min2=min1;
//                min1=min;
//                min=arr[i];
//            }else if(arr[i]<min&& min1 != arr[i] && min != arr[i]){
//                min2=arr[i];
//            }
//        }
//        System.out.println(min2);

//        int [] arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int m=3;
//        m=m%n;
//        for(int i=0; i<m; i++){
//            int temp=arr[0];
//            for(int j=0; j<n-1; j++){
//                arr[j]=arr[j+1];
//            }
//            arr[n-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={11,21,31,4,5,6};
//        int n=3;
//        System.out.println(arr[n-1]);

//        int arr[]={2,9,5,4,6,8,1};
//        int n=arr.length;
//        int left=0;
//        int right=n-1;
//        while (left<right){
//            if(arr[left]%2 == 1){
//                left++;
//            }else if(arr[right]%2 == 0){
//                right--;
//            }else{
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,4,6,8,9};
//        int sum=8;
//        int i=0;
//        int j=arr.length-1;
//        while (i<j){
//            if(arr[i]+arr[j]==sum){
//                System.out.println("present");
//                return;
//            }else if(arr[i]+arr[j]<sum){
//                i++;
//            }else {
//                j--;
//            }
//        }
//        System.out.println("Not present");

//        int [] arr={5,4,3,6,7,8};
//        int [] a=new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int count =0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[j]<arr[i]){
//                    count++;
//                }
//            }
//           a[i]=count;
//        }
//        System.out.println(Arrays.toString(a));

//        int [] arr={1,2,3,4,5,6};
//        int []b=new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1; i>=0; i--){
//            b[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(b));

//        int [] arr={1,2,3,4,3,2};
//        int n=4;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//              count++;
//            }
//        }
//        if(count<2){
//            System.out.println("unique");
//        }else {
//            System.out.println("Not unique");
//        }

//        int [] arr={1,2,3,4,2,3,5};
//        for(int i=0; i<arr.length; i++){
//            int v=arr[i];
//            int count=0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[j]==v){
//                    count++;
//                    if(count>1){
//                        break;
//                    }
//                }
//            }
//            if(count==1){
//                System.out.print(v + " ");
//            }
//        }
//        String str="manasvi";
//        System.out.println(str);
//        for(int i=str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i) + "");
//        }

//        String str="manasvi";
//        char[] arr=str.toCharArray();
//        int i=0;
//        int j=str.length()-1;
//        while (i < j){
//            char temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(str);
//        System.out.println(arr);

//        String s="madama";
//        if(isPalindrome(s)==true){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
//    }
//    public static boolean isPalindrome(String s){
//        int i=0;
//        int j=s.length()-1;
//        while (i<j){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;

//        String s="manasvi";
//        int count=0;
//        String [] ch=s.split(" ");
//        for(int i=0; i<ch.length; i++){
//            count++;
//        }
//        System.out.println("count word : " + count);

//        String s="hello world";
//        char [] ch=s.toCharArray();
//        int count =1;
//        for(int i=0; i<ch.length; i++){
//            if(ch[i]==' '){
//                count++;
//            }
//        }
//        System.out.println("Count word : " + count);

//        String s="madam oko nitin";
//        String [] s1=s.split(" ");
//        for(int i=0; i<s1.length; i++){
//            String original=s1[i];
//            char []ch=s1[i].toCharArray();
//            String reverse="";
//
//            for(int j=ch.length-1; j>=0; j--){
//                reverse=reverse+ch[j];
//            }
//            if(!reverse.equals(original)){
//                System.out.println("not palindrome");
//                return;
//            }
//        }
//        System.out.println("palindrome");

//        String s1="hello";
//        String s2="hello";
//        if(isSame(s1, s2)==true){
//            System.out.println("Same");
//        }else {
//            System.out.println("not same");
//        }
//
//    }
//    public static boolean isSame(String s1, String s2){
//        if(s1.length() != s2.length()){
//            return false;
//        }
//
//        for(int i=0; i<s1.length(); i++){
//            if(s1.charAt(i) !=(s2.charAt(i))){
//                return false;
//            }
//        }
//        return true;


//        String s="hello world";
//        char [] ch=s.toCharArray();
//
//        for(int i=0; i<ch.length; i++){
//            if(ch[i] == 'l'){
//                ch[i] ='v';
//            }
//        }
//        String update=new String(ch);
//        System.out.println(update);
//
//
//        String s2=s.replace('l', 'r');
//        System.out.println(s2);

//        String s="manasvi";
//        char [] ch=s.toCharArray();
//
//        for(int i=0; i<s.length()-1; i++){
//            for(int j=0; j<s.length()-i-1; j++){
//                if(ch[j]>ch[j+1]){
//                    char temp=ch[j];
//                    ch[j]=ch[j+1];
//                    ch[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(ch);

//        String s="Hello";
//        int [] arr=new int[128];
//
//        for (int i=0; i<s.length(); i++){
//            int ascciValue=s.charAt(i);
//            arr[ascciValue]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>0){
//                System.out.println((char)i + " : " + arr[i]);
//            }
//        }

//        String s="Manasvi";
//        char [] ch=s.toCharArray();
//        String s1="";
//        for(int i=0; i<ch.length; i++){
//            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'A' &&
//                    ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' ){
//                s1=s1+ch[i];
//            }
//        }
//        System.out.println(s1);

//        String s="manasvi good morning";
//        String [] s1=s.split(" ");
//       String s2="";
//       for(int i=0; i<s1.length; i++){
//           char []ch=s1[i].toCharArray();
//           for(int j=ch.length-1; j>=0; j--){
//               s2=s2+ch[j];
//           }
//           s2=s2+" ";
//       }
//        System.out.println(s2);

//        String s="hello world";
//        int [] arr=new int[128];
//        for(int i=0; i<s.length(); i++){
//            int ascciValue=s.charAt(i);
//            arr[ascciValue]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] >1){
//                System.out.println((char)i);
//            }
//        }

//        String s="abcd1234";
//        String s1="";
//        char []ch=s.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            if(ch[i] >= '0' && ch[i] <= '9'){
//               continue;
//            }
//            s1=s1+ch[i];
//        }
//        System.out.println(s1);

//        String s="abcd";
//        String s1="wxyz";
//
//        char []ch=s.toCharArray();
//        char []ch1=s1.toCharArray();
//        char []ch3=new char[s.length()+s1.length()];
//
//        for(int i=0; i<ch3.length; i+=2){
//            ch3[i]=ch[i/2];
//        }
//        for(int i=1; i<ch3.length; i+=2){
//            ch3[i]=ch1[i/2];
//        }
//        String s2=new String(ch3);
//        System.out.println(s2);


//        String s="abcde 1234";
//        char []ch=s.toCharArray();
//
//        int digit=0;
//        int chars=0;
//        for(int i=0; i<ch.length; i++){
//            if(ch[i] >= '0' && ch[i]<='9'){
//                digit++;
//            }else if(ch[i] == ' '){
//                continue;
//            }else {
//                chars++;
//            }
//        }
//        if(digit==chars){
//            System.out.println("same");
//        }else {
//            System.out.println("not same");
//        }

//        String s="hello world";
//        int [] arr=new int[128];
//        String ans="";
//        for(int i=0; i<s.length(); i++){
//            int ascciValue=s.charAt(i);
//            arr[ascciValue]++;
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==1){
//                ans=ans+arr[i];
//                System.out.print((char)i);
//            }
//        }

//        String s1="hello";
//        String s2="world";
//
//        System.out.println(s1 + " " + s2);
//
//        s1=s1+s2;
//        s2=s1.substring(0,(s1.length()-s2.length()));
//        s1=s1.substring(s2.length());
//
//        System.out.print(s1 + " " + s2);

//        String s="12345";
//        int i=0;
//        int ans=0;
//        while (i<s.length()){
//            char ch=s.charAt(i);
//            if(ch >='0' && ch <='9'){
//                int digit=ch-'0';
//                ans=ans*10 + digit;
//            }
//            i++;
//        }
//        int a=ans;
//        System.out.println(a);

//        String s="program";
//        char[]ch=s.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print(ch[j]);
//            }
//            System.out.println();
//        }

//        String str="abac";
//        String str2="aabc";
//         int[] arr=countFrequency(str);
//         int[] arr1=countFrequency(str2);
//         for(int i=0; i<128; i++){
//             if(arr[i] != arr1[i]){
//                 System.out.println("false");
//                 return;
//             }
//         }
//        System.out.println("true");
//    }
//    public static int[] countFrequency(String str){
//        int[] arr=new int[128];
//        for(int i=0; i<str.length(); i++){
//            int ascciValue=str.charAt(i);
//            arr[ascciValue]++;
//        }
//        return arr;

//        Scanner sc=new Scanner(System.in);
//        int row=sc.nextInt();
//        int column=sc.nextInt();
//        int[][] numbers=new int[row][column];
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<column; j++){
//                numbers[i][j]=sc.nextInt();
//            }
//        }
//        int x=sc.nextInt();
//
//        for(int i=0; i<row; i++){
//            for(int j=0; j<column; j++){
//               if(numbers[i][j]==x){
//                   System.out.println("found location "+ i + " " + j);
//               }
//            }
//
//        }
    }
}
