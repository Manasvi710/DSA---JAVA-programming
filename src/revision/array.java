package revision;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        int []arr={1,2,3,4,5};
//        int sum=0;
//        for(int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);

//        int arr[]={1,2,3,4,5};
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }


//        int []arr={1,2,3,4,5};
//        int sum=0;
//        int avg=0;
//        for(int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//            avg=sum/arr.length;
//        }
//        System.out.println(avg);

//        int []arr={1,2,3,4,5,6};
//        int d=13;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==d) {
//                System.out.println("prsent");
//                return;
//            }
//        }
//        System.out.println("not present");

//        int []arr={1,2,3,4,5,6,7};
//        int odd=0;
//        int even=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 ==1){
//                odd++;
//            }else{
//                even++;
//            }
//        }
//        System.out.println(odd + " ");
//        System.out.print(even + " ");

//        int []arr={10,12,13,14,15,16};
//        int d=3;
//        System.out.println(arr[d-1]);

//        int[]arr={10,12,13,14,15,16};
//        int n=2;
//        System.out.println(arr[arr.length-n]);

//        int []arr={1,2,3,4,5,6};
//        for(int i=0; i<arr.length; i+=2){
//            System.out.print(arr[i] + " ");
//        }

//        int []arr={1,2,3,4,5,6};
//        for(int i=arr.length-1; i>=0; i-=2){
//            System.out.print(arr[i]+ " ");
//        }

//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(arr[i] + " ");
//            }
//        }

//        int []arr={1,2,3,4,9,6};
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

//        int []arr={1,2,3,4,5,6};
//        int min=Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

//        int []arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        for(int i=0; i<arr.length; i++){
//            a[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(a));

//        int[]arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 1) {
//                a[j] = arr[i];
//                j++;
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                a[j] =arr[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(a));

//        int[]arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        int j=0;
//        for(int i=n-1; i>=0; i--){
//            a[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(a));

//        int []arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int i=0;
//        int j=n-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        for(int i=0; i<n; i++){
//            int count=0;
//            for(int j=0; j<n; j++){
//                if(arr[j] < arr[i]){
//                    count++;
//                }
//            }
//            a[i]=count;
//        }
//        System.out.println(Arrays.toString(a));

//        int []arr={1,12,6,31,7,9,3,5,0};
//        int d=3;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] != 0 && arr[i]%d==0){
//                System.out.print(arr[i] + " ");
//            }
//        }

//        int []arr={4,3,6,7,21,11,15,5};
//        for(int i=0; i<arr.length; i++){
//            if(isprime(arr[i])==true){
//                System.out.print(arr[i]+ " ");
//            }
//        }
//    }
//    static boolean isprime(int n){
//        for(int i=2; i<n; i++){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;

//        int []arr={1,2,3,4,5,6};
//        int n=arr.length;
//        int a1[]=new int[n/2];
//        int a2[]=new int[n/2];
//        for(int i=0; i<n/2; i++){
//            a1[i]=arr[i];
//        }
//        int j=0;
//        for(int i=n/2; i<n; i++){
//            a2[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(a2));

//        int []a1={1,2,3,4};
//        int []a2={5,6,7};
//        int []arr=new int[a1.length+a2.length];
//        int j=0;
//        for(int i=0; i<a1.length; i++){
//            arr[j]=a1[i];
//            j++;
//        }
//        for(int i=0; i<a2.length; i++){
//            arr[j]=a2[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={6,3,5,2,7,6};
//        int d=6;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==d) {
//                count++;
//            }
//        }
//        System.out.print(count);

//        int []arr={1,2,6,3};
//        String ans=null;
//        for(int i=1; i<arr.length; i++){
//            if(arr[i]>arr[i-1]){
//                ans="true";
//            }else {
//                ans="false";
//            }
//        }
//        System.out.println(ans);

//        int []arr={1,2,6,3};
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");

//        int []arr={1,2,3,4,5};
//        int n=arr.length;
//        int []arr2=new int[n*2];
//        int j=0;
//        for(int i=0; i<n; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        for(int i=0; i<n; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr2));

//        int arr1[]={1,2,3,4};
//        int arr2[]={5,6,7,8};
//        int arr3[]=new int[arr1.length+arr2.length];
//        for(int i=0; i<arr3.length; i+=2){
//            arr3[i]=arr1[i/2];
//        }
//        for(int i=1; i<arr3.length; i+=2){
//            arr3[i]=arr2[i/2];
//        }
//        System.out.println(Arrays.toString(arr3));

//        int []arr={1,2,5,4,3,2,8,2};
//        int n=1;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//                count++;
//            }
//        }
//        if(count >=2){
//            System.out.println("duplicate");
//        }else{
//            System.out.println("not duplicate");
//        }

//        int []arr={1,2,3,4,5,3};
//        int n=3;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//                count++;
//            }
//        }
//        if(count == 1){
//            System.out.println("unique");
//        }else{
//            System.out.println("not unique");
//        }

//        int []arr={1,2,3,4,5,6};
//        int []arr2={1,2,3};
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr2.length; j++){
//                if(arr2[j]==arr[i]){
//                    System.out.print(arr[i]+ " ");
//                }
//            }
//        }

//        int []arr={1,2,3,4,5,6,2};
//        for(int i=0; i<arr.length; i++){
//            int v=arr[i];
//            int c=0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[j]==v){
//                    c++;
//                    if(c>1){
//                        break;
//                    }
//                }
//            }
//            if(c==1){
//                System.out.print(v + " ");
//            }
//        }

//        int []arr={1,2,3,4,3,5,4,6};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int v=arr[i];
//            int c=0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[j]==v){
//                    c++;
//                    arr[j]=-1;
//                }
//            }
//            if(c >= 2){
//                System.out.print(v + " ");
//            }
//        }

//        int []arr={1,2,3,4,5,6,7,8};
//        int n=7;
//        int start=0;
//        int end=arr.length-1;
//        while(start <= end){
//            int mid=(start+end)/2;
//            if(arr[mid]==n){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] < n){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        System.out.println("not present");

//        int []arr={9,5,3,1,0,-1,-3,-6};
//        int n=-6;
//        int start=0;
//        int end=arr.length-1;
//        while(start <=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==n){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] > n){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        System.out.println("not present");

//        int []arr={5,4,2,7,3,1,8,6};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={5,4,2,6,8,1,7,3};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            int minIndex=i;
//            for(int j=i+1; j<n; j++){
//                if(arr[j]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            if(i != minIndex){
//                int temp=arr[i];
//                arr[i]=arr[minIndex];
//                arr[minIndex]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={4,2,1,6,3,7,5,8};
//        int n=arr.length;
//        for(int i=1; i<n; i++){
//            int j=i-1;
//            int temp=arr[i];
//            while(j >= 0  && arr[j] > temp){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={1,2,9,15,27,30};
//        int sum=39;
//        int left=0;
//        int right=arr.length-1;
//        while (left < right){
//            if(arr[left]+arr[right]==sum){
//                System.out.println("present");
//                return;
//            }else if(arr[left]+arr[right] < sum){
//                left++;
//            }else{
//                right--;
//            }
//        }
//        System.out.println("not present");

//        int []arr={0,1,0,0,1,1,0,1};
//        int left=0;
//        int right=arr.length-1;
//        while(left < right){
//            if(arr[left]==0){
//                left++;
//            }else if(arr[right]==1){
//                right--;
//            }else{
//                arr[left]=0;
//                arr[right]=1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int []arr={1,2,3,4,5,6,7};
//        int left=0;
//        int right=arr.length-1;
//        while(left < right){
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

//        int []arr={1,2,3,7,5,8,9};
//        int max=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max2=max;
//                max=arr[i];
//            }else if(arr[i]>max2 && arr[i] != max){
//                max2=arr[i];
//            }
//        }
//        System.out.print(max2);

//        int []arr={1,4,3,7,8,3,2,9};
//        int max=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        int max3=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max3=max2;
//                max2=max;
//                max=arr[i];
//            }else if(arr[i]>max3 && arr[i] != max2 && arr[i] != max){
//                max3=arr[i];
//            }
//        }
//        System.out.print(max3);

//        int n=5;
//        int []arr={1,5,4,2};
//        int sum=(n*(n+1))/2;
//        int sum2=0;
//        for(int i=0; i<arr.length; i++){
//            sum2=sum2+arr[i];
//        }
//        System.out.print(sum-sum2);

//        int n=5;
//        int []arr={1,5,4,2,3,6};
//        int sum=(n*(n+1))/2;
//        int sum2=0;
//        for(int i=0; i<arr.length; i++){
//            sum2=sum2+arr[i];
//        }
//        System.out.print(sum2-sum);

//        int [] arr={1,2,3,4,5,6,7,8};
//        int m=3;
//        int n= arr.length;
//        m=m%n;
//        for(int i=0; i<m; i++){
//            int temp=arr[0];
//            for(int j=0; j<n-1; j++){
//                 arr[j]=arr[j+1];
//            }
//            arr[n-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr1={1,2,6,8,12,15,16};
//        int [] arr2={0,3,5,10};
//        int n1=arr1.length;
//        int n2=arr2.length;
//        int arr3[]=new int[n1+n2];
//        int i=0, j=0,k=0;
//        while(i < n1 && j < n2){
//            if(arr1[i] < arr2[j]){
//                arr3[k]=arr1[i];
//                i++;
//            }else{
//                arr3[k]=arr2[j];
//                j++;
//            }
//            k++;
//        }
//        while(i < n1){
//            arr3[k]=arr1[i];
//            i++;
//            k++;
//        }
//        while (j < n2){
//            arr3[k]=arr2[j];
//            j++;
//            k++;
//        }
//        System.out.println(Arrays.toString(arr3));
//        int nums[] ={1,2,2,1};
//        int k=1;
//        int count=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                if(Math.abs(nums[i]-nums[j])==k) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

 // ================================User input ======================================

//        int n, sum = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter size of the array:");
//        n = s.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter array elements:");
//        for(int i = 0; i < n; i++)
//        {
//            a[i] = s.nextInt();
//            sum = sum + a[i];
//        }
//        System.out.println("Sum of the array is:"+sum);
//
//        int n;
//        double sum=0;
//        double avg=0;
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter size of the array -- ");
//        n=s.nextInt();
//        int a[]=new int[n];
//        System.out.println("enter array element");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//            sum+=a[i];
//            avg=sum/n;
//        }
//        System.out.println(avg);

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        for(int i=n-1; i>=0; i--){
//            System.out.print(a[i] + " ");
//        }

//        int []arr={12,5,7,8,4,2,3};
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]==n){
//                System.out.println("present");
//                return;
//            }
//        }
//        System.out.println("not present");

//        int odd, even;
//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        odd=0;
//        even = 0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]%2 ==1){
//                odd++;
//            }else {
//                even++;
//            }
//        }
//        System.out.println("Odd - " + odd);
//        System.out.println("Even - " + even);

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        for(int i=0; i<n; i+=2){
//            System.out.print(a[i] + " ");
//        }

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        for(int i=n-1; i>=0; i-=2){
//            System.out.print(a[i] + " ");
//        }

//        int max;
//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        max=Integer.MIN_VALUE;
//        for(int i=0; i<n; i++){
//            if(a[i] > max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int b[]=new int[n];
//        for(int i=0; i<n; i++){
//            b[i]=a[i];
//        }
//        System.out.println(Arrays.toString(b));

//        int j, odd, even;
//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int []b=new int[n];
//        j=0;
//        for(int i=0; i<n; i++){
//            if(a[i]%2 == 1){
//                b[j]=a[i];
//                j++;
//            }
//        }
//        for(int i=0; i<n; i++){
//            if(a[i]%2 ==0){
//                b[j]=a[i];
//                j++;
//            }
//        }
//        System.out.print(Arrays.toString(b));

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int b[]=new int[n];
//        int j=0;
//        for(int i=n-1; i>=0; i--){
//            b[j]=a[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(b));

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size -- ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int [] b=new int[n];
//        for(int i=0; i<n; i++){
//            int count =0;
//            for(int j=0; j<n; j++){
//                if(a[j] < a[i]){
//                    count++;
//                }
//            }
//            b[i]=count;
//        }
//        System.out.println(Arrays.toString(b));

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int []b = new int[n];
//        System.out.print("enter value - ");
//        for(int i=0; i<n; i++){
//            b[i]=s.nextInt();
//        }
//        int []c=new int[n+n];
//        int j=0;
//        for(int i=0; i<n; i++){
//            c[j]=a[i];
//            j++;
//        }
//        for(int i=0; i<n; i++){
//            c[j]=b[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(c));

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int b[]=new int[n*2];
//        int j=0;
//        for(int i=0; i<n; i++){
//            b[j]=a[i];
//            j++;
//        }
//        for(int i=0; i<n; i++){
//            b[j]=a[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(b));

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//       int []b=new int[n/2];
//        int []c=new int[n/2];
//        for(int i=0; i<n/2; i++){
//            b[i]=a[i];
//        }
//        int j=0;
//        for(int i=n/2; i<n; i++){
//            c[j]=a[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));


//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        int []b=new int[n];
//        for(int i=0; i<n; i++){
//            b[i]=s.nextInt();
//        }
//        int []c=new int[n*2];
//        for(int i=0; i<n*2; i+=2){
//            c[i]=a[i/2];
//        }
//        for(int i=1; i<n*2; i+=2){
//            c[i]=b[i/2];
//        }
//        System.out.println(Arrays.toString(c));


//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//        }
//        for(int i=0; i<n-1; i++){
//            if(a[i] > a[i+1]){
//                System.out.println("false");
//                return;
//            }
//        }
//        System.out.println("true");


//        int a[]={1,2,3,4,1,3,1};
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int count=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]==n){
//                count++;
//            }
//        }
//        System.out.println(count);

//        int a[]={1,2,3,2,4,5,2};
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int count=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]==n){
//                count++;
//            }
//        }
//        if(count>=2){
//            System.out.println("duplicate");
//        }else{
//            System.out.println("not duplicate");
//        }

//        int a[]={1,2,3,2,4,5,2};
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int count=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]==n){
//                count++;
//            }
//        }
//        if(count<2){
//            System.out.println("unique");
//        }else{
//            System.out.println("not unique");
//        }

//        Scanner s=new Scanner(System.in);
//        System.out.print("enter size - ");
//        int n=s.nextInt();
//        int [] a=new int[n];
//        System.out.print("enter Value - ");
//        for(int i=0; i<n; i++){
//            a[i]=s.nextInt();
//       }
//        int i=0;
//        int j=n-1;
//        while(i<j){
//            int temp=a[i];
//            a[i]=a[j];
//            a[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(a));
   }
}
