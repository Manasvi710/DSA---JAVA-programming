package practice;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class practiceArray {
    public static void main(String[] args) {
//        int arr[]={2,3,4,5,6};
//        int sum=0;
//        for(int i=0; i<arr.length; i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
//        int arr[]={1,2,3,4,5};
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }
//        int arr[]={1,2,3,4,5,6};
//        double sum=0;
//        double avg=0;
//        for(int i=0; i< arr.length; i++){
//            sum=sum+arr[i];
//            avg=sum/arr.length;
//        }
//        System.out.println(avg);
//     int arr[]={1,2,3,4,5,6};
//     int n=arr.length;
//     int a=7;
//     for(int i=0; i<n; i++){
//         if(arr[i]==a){
//             System.out.println("present");
//             return;
//         }
//     }
//        System.out.println("not present");
//        int arr[]={1,2,3,4,5,6};
//        int even=0, odd=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2==0) {
//                even++;
//            }else{
//                odd++;
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);
//        int arr[]={1,2,3,4,5,6};
//        int n=3;
//        System.out.println(arr[n-1]);
//        int arr[]={12,13,14,15,16,17};
//        int n=4;
//        System.out.println(arr[arr.length-n]);
//        int arr[]={1,2,3,4,5,6,7,8};
//        for(int i=0; i<arr.length; i+=2){
//            System.out.println(arr[i]);
//        }
//        int arr[]={1,2,3,4,5,6,7,8};
//        for(int i=arr.length-1; i>=0; i-=2){
//            System.out.println(arr[i]);
//        }
//        int arr[]={1,2,3,4,5,6,7};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 != 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 ==0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        int arr[]={1,2,3,4,5,6};
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//        int arr[]={1,2,3,4,5,6};
//        int min=Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);
//        int arr[]={1,2,3,4,5,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        for(int i=0; i<n; i++){
//            a[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(a));
//         int arr[]={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int a[]=new int[n];
//         int j=0;
//         for(int i= n-1; i>=0; i--){
//             a[j]=arr[i];
//             j++;
//         }
//        System.out.println(Arrays.toString(a));
//        int arr[]={1,2,5,4,3,6};
//        int n=arr.length;
//        int a[]=new int[n];
//        for(int i=0; i<n; i++){
//            int count =0;
//            for(int j=0; j<n; j++){
//                if(arr[j]<arr[i])
//                count++;
//            }
//            a[i]=count;
//        }
//        System.out.println(Arrays.toString(a));
//        int arr[]={1,12,6,31,7,9,3,5,0};
//        int d=3;
//        int n=arr.length;
//        for(int i=0; i<n; i++){
//            if(arr[i] != 0 && arr[i]%d==0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        int arr[]={4,3,6,7,21,11,15,5};
//        for(int i=0; i< arr.length; i++){
//            if(primeNumber(arr[i]) == true){
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//    static boolean primeNumber(int n){
//        for(int i=2; i<n; i++){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;
//        int arr[]={1,2,3,4,5,6};
//        int n= arr.length;
//        int a1[]=new int[n/2];
//        int a2[]=new int[n/2];
//
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
//        int a1[]={1,2,3,4};
//        int a2[]={5,6,7,8};
//        int arr[]=new int[a1.length+a2.length];
//        int j=0;
//        for(int i=0; i< a1.length; i++){
//            arr[j]=a1[i];
//            j++;
//        }
//        for(int i=0; i<a2.length; i++){
//            arr[j]=a2[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr));
//        int arr[]={6,3,5,2,7,6};
//        int d=6;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == d){
//                count++;
//            }
//        }
//        System.out.println(count);
//        int arr[]={1,2,3,4,5};
//        int n= arr.length;
//        String ans=null;
//        for(int i=1; i<n; i++){
//            if(arr[i] >= arr[i-1]){
//                ans="true";
//            }else {
//                ans="false";
//            }
//        }
//        System.out.println(ans);
//        int arr[]={1,2,3,4,5,6};
//        int a1[]=new int[arr.length*2];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            a1[j]=arr[i];
//            j++;
//        }
//        for(int i=0; i<arr.length; i++){
//            a1[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(a1));
//        int arr1[]={1,2,3,4};
//        int arr2[]={5,6,7,8};
//        int arr3[]=new int[arr1.length+arr2.length];
//
//        for(int i=0; i<arr3.length; i+=2){
//            arr3[i]=arr1[i/2];
//        }
//        for(int i=1; i<arr3.length; i+=2){
//            arr3[i]=arr2[i/2];
//        }
//        System.out.print(Arrays.toString(arr3));
//        int arr[]={1,2,3,4,5};
//        int d=5;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==d){
//                count++;
//            }
//        }
//        if(count >= 2){
//            System.out.println("duplicate");
//        }else{
//            System.out.println("Not duplicate");
//        }
//        int arr[]={1,2,3,4,5};
//        int d=5;
//        int count =0;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i]==d){
//                count++;
//            }
//        }
//        if(count < 2){
//            System.out.println("unique");
//        }else{
//            System.out.println("not unique");
//        }
//        int a1[]={1,2,3,4,5,6};
//        int a2[]={1,2,3};
//        for(int i=0; i<a1.length; i++){
//            for(int j=0; j<a2.length; j++){
//                if(a1[i] == a2[j]){
//                    System.out.print(a1[i] + " ");
//                }
//            }
//        }
//        int arr[]={1,2,3,4,5,6};
//        int n= arr.length;
//        int i=0;
//        int j=n-1;
//        while(i < j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));
//        int arr[]={2,3,4,5,1,5,2};
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
//        int arr[]={2,3,4,5,2,5,2};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int v=arr[i];
//            int c=0;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j]==v){
//                    c++;
//                    arr[j]=-1;
//                }
//            }
//            if(c>0){
//                System.out.print(v + " ");
//            }
//        }
//        int arr[]={2,7,3,6,10,5,22};
//        int sum=8;
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j]==sum){
//                    System.out.println("present");
//                    return;
//                }
//            }
//        }
//        System.out.println("not present");
//        int arr[]={1,3,7,11,14,16,20};
//        int sum=19;
//        int i=0;
//        int j=arr.length-1;
//        while(i<j){
//            if(arr[i]+arr[j]==sum){
//                System.out.println("present");
//                return;
//            }else if(arr[i]+arr[j]<sum){
//                i++;
//            }else{
//                j--;
//            }
//        }
//        System.out.println("not present");
//        int [] arr={1,2,3,4,5,6,7,8};
//        int m=3;
//        for(int i=0; i<m; i++){
//            int temp=arr[i];
//            for(int j=0; j<arr.length-1; j++){
//                arr[j]=arr[j+1];
//            }
//            arr[arr.length-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        int arr[]={5,3,10,9,6,13};
//        for(int i=0; i<arr.length;i++) {
//            int m = -1;
//            for (int j=i+1; j<arr.length; j++){
//                if(arr[j]>arr[i]){
//                    m=arr[j];
//                    break;
//                }
//            }
//            System.out.print(m + " ");
//        }
//        int arr[]={2,7,4,7,8,3,4,8,9,9};
//        int a=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int c=0;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]==arr[j]){
//                    c++;
//                    arr[j]=-1;
//                }
//            }
//            if(c>0){
//                System.out.print(arr[i]+" ");
//                a++;
//            }
//            if(a==2){
//                return;
//            }
//        }
//        int arr[]={1,3,3,7,4,3,2,3,3,2,7,7};
//        int a=0;
//        int ans=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int c=0;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j]==arr[i]){
//                    c++;
//                    arr[j]=-1;
//                }
//            }
//            if(c>a){
//                a=c;
//                ans=arr[i];
//            }
//        }
//        System.out.print(ans + " ");

//        int [] arr={2,3,4,5,6};
//        int sum=0;
//        int avg=0;
//        for(int i=0; i<arr.length; i++){
//            sum+=arr[i];
//            avg=sum/arr.length;
//        }
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(sum);
//        System.out.println(avg);

//        int [] arr={2,3,4,5,6};
//        int n=8;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==n){
//                System.out.println("present");
//                return;
//            }
//        }
//        System.out.println("not present");

//        int [] arr={1,2,3,4,5,6};
//        int o=0;
//        int e=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 != 0){
//                o++;
//            }else{
//                e++;
//            }
//        }
//        System.out.println("Odd" + o);
//        System.out.println("even" + e);

//        int [] arr={11,12,13,14,15};
//        int n=4;
//        System.out.println(arr[n-1]);
//        System.out.println(arr[arr.length-n]);

//        int [] arr={1,2,3,4,5,6};
//        for(int i=0; i<arr.length; i+=2){
//            System.out.print(arr[i] + " ");
//        }
//        for(int i=arr.length-1; i>=0; i-=2){
//            System.out.print(arr[i] + " ");
//        }

//        int [] arr={1,2,3,4,5,6,7};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 != 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                System.out.print(arr[i] + " ");
//            }
//        }

//        int [] arr={1,2,13,4,5,6};
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

//        int [] arr={1,2,3,4,5,6};
//        int [] b=new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            b[i]=arr[i];
//        }
//        System.out.print(Arrays.toString(b));

//        int [] arr={1,2,3,4,5,6,7};
//        int [] b=new int[arr.length];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] %2 != 0) {
//                b[j] = arr[i];
//                j++;
//            }
//        }
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                b[j]=arr[i];
//                j++;
//            }
//        }
//        System.out.print(Arrays.toString(b));

//        int [] arr={1,2,3,4,5,6,7};
//        int [] b=new int[arr.length];
//        int j=0;
//        for(int i=arr.length-1; i>=0; i--){
//            b[j]=arr[i];
//            j++;
//        }
//        System.out.print(Arrays.toString(b));

//        int [] arr={1,2,3,4,5,6};
//        int i=0;
//        int j=arr.length-1;
//        while (i< j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.print(Arrays.toString(arr));

//        int [] arr={1,2,3,4,5,6};
//        int [] b=new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int count=0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[j] < arr[i]){
//                    count++;
//                }
//            }
//            b[i] = count;
//        }
//        System.out.print(Arrays.toString(b));

//        int [] arr={1,2,3,4,5};
//        int [] arr2=new int[arr.length*2];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        for(int i=0; i<arr.length; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr2));

//        int [] arr={1,2,3,4};
//        int [] arr1={5,6,7,8};
//        int [] arr2=new int[arr.length+arr1.length];
//        for(int i=0; i<arr2.length; i+=2){
//            arr2[i]=arr[i/2];
//        }
//        for(int i=1; i<arr2.length; i+=2){
//            arr2[i]=arr1[i/2];
//        }
//        System.out.println(Arrays.toString(arr2));

//        int [] arr={1,2,3,4,5,4};
//        int n=3;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == n){
//                count++;
//            }
//        }
//        if(count>=2){
//            System.out.println("duplicate");
//        }else{
//            System.out.println("not duplicate");
//        }

//        int [] arr={1,2,3,4,4,5};
//        int n=4;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == n){
//                count++;
//            }
//        }
//        if(count<2){
//            System.out.println("unique");
//        }else{
//            System.out.println("not unique");
//        }

//        int [] arr={1,2,3,4,5,6,7};
//        int [] arr1={1,2,3,4};
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr1.length; j++){
//                if(arr1[j]==arr[i]){
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        }

//        int [] arr={1,12,6,13,7,9,3,5,0};
//        int d=3;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]!=0 && arr[i] % d==0){
//                System.out.print(arr[i] + " ");
//            }
//        }

//       int [] arr={4,3,6,7,21,11,15,5};
//       for(int i=0; i<arr.length; i++){
//           if(isPrime(arr[i])==true){
//               System.out.print(arr[i] + " ");
//           }
//       }
//    }
//    public static boolean isPrime(int n){
//        for(int i=2; i<n; i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;

//        int [] arr={1,2,3,4,5,6};
//        int [] arr1=new int[arr.length/2];
//        int [] arr2=new int[arr.length/2];
//        for(int i=0; i<arr.length/2; i++){
//            arr1[i]=arr[i];
//        }
//        int j=0;
//        for(int i=arr.length/2; i<arr.length; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

//        int [] arr={1,2,3,4};
//        int [] arr1={5,6,7,8};
//        int [] arr2=new int[arr.length+arr1.length];
//        int j=0;
//        for(int i=0; i<arr.length; i++){
//            arr2[j]=arr[i];
//            j++;
//        }
//        for(int i=0; i<arr1.length; i++){
//            arr2[j]=arr1[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(arr2));

//        int [] arr={1,2,3,4,5,3,6};
//        int d=3;
//        int count=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == d){
//                count++;
//            }
//        }
//        System.out.println(count);

//        int [] arr={1,4,8,6,7};
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i] > arr[i+1]){
//                System.out.print("false");
//                return;
//            }
//        }
//        System.out.println("true");

//        int [] arr={1,2,2,4,5,5,6,7,7};
//        for(int i=0; i<arr.length; i++) {
//            int v=arr[i];
//            int count = 0;
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

//        int [] arr={1,2,2,3,4,4,5,6,7};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==-1){
//                continue;
//            }
//            int v=arr[i];
//            int count =0;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j] == v){
//                    count++;
//                    arr[j]=-1;
//                }
//            }
//            if(count >0){
//                System.out.print(v + " ");
//            }
//        }

//        int [] arr={1,6,3,2,5,7,4};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if (arr[j] > arr[j+1]) {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={5,4,3,2,1,6,7};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            int minIndex=i;
//            for(int j=i+1; j<n; j++){
//                if(arr[j]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            if(i!=minIndex){
//                int temp=arr[i];
//                arr[i]=arr[minIndex];
//                arr[minIndex]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,4,2,6,5,7,3};
//        int n=arr.length;
//        for(int i=1; i<n; i++){
//            int j=i-1;
//            int temp=arr[i];
//            while(j>=0 && arr[j] > temp){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,2,3,4,5,6,7};
//        int max=Integer.MIN_VALUE;
//        int max1=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max1=max;
//                max=arr[i];
//            }else if(max1 == arr[i] && max != arr[i]){
//                max1=arr[i];
//            }
//        }
//        System.out.println(max1);

//        int [] arr={1,3,4,5,6,7,9,10};
//        int max1=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        int max3=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max1){
//                max3=max2;
//                max2=max1;
//                max1=arr[i];
//            }else if(max3>arr[i] && arr[i] != max2 && arr[i]!= max1){
//                max3=arr[i];
//            }
//        }
//        System.out.println(max3);

//        int [] arr={1,2,3,4,5,8,9,10};
//        int d=19;
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==d){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] < d){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        System.out.println("Not present");

//        int [] arr={11,8,7,4,-5,-8,-9,-10};
//        int d=10;
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==d){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] > d){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        System.out.println("Not present");

//        int [] arr={2,7,3,6,8,9, 10};
//        int sum=10;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length; j++){
//                if(arr[i] + arr[j] == sum){
//                    System.out.println("present");
//                    return;
//                }
//            }
//        }
//        System.out.println("Not Present");

//        int [] arr={1,3,7,11,14,16,20};
//        int sum=19;
//        int i=0;
//        int j=arr.length-1;
//        while (i < j){
//            if(arr[i] + arr[j] == sum){
//                System.out.println("present");
//                return;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("Not present");

//        int [] arr={1,2,3,4,5,6,7,8};
//        int m=3;
//        for(int i=0; i<m; i++){
//            int temp=arr[0];
//            for(int j=0; j<arr.length-1; j++){
//                arr[j]=arr[j+1];
//            }
//            arr[arr.length-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={5,3,6,9,5,10};
//        for(int i=0; i<arr.length; i++){
//            int m=-1;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j] > arr[i]){
//                    m=arr[j];
//                    break;
//                }
//            }
//            System.out.print(m + " ");
//        }

//        int [] arr=new int[5];
//        int p=0;
//        System.out.println(isEmpty(p));
//        p=insert(arr,p,10);
//        p=insert(arr,p,20);
//        p=insert(arr,p,30);
//        p=insert(arr,p,40);
//        p=insert(arr,p,50);
//        print(arr, p);
//        p=delete(arr,p,40);
//        System.out.println();
//        print(arr,p);
//        update(arr, p, 50,55);
//        System.out.println();
//        print(arr,p);
//        p=find(arr, p, 30);
//
//    }
//    private static boolean isEmpty(int p){
//        if(p==0){
//            return true;
//        }
//        return false;
//    }
//    private static int insert(int [] arr, int p, int value){
//        if(p==arr.length){
//            System.out.println("array is full");
//            return p;
//        }
//        arr[p]=value;
//        p++;
//        return p;
//    }
//    private static void print(int [] arr, int p){
//        for(int i=0; i<p; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    private static int delete(int [] arr, int p, int value){
//        for(int i=0; i<p; i++){
//            if(arr[i] == value){
//                for(int j=i; j<p-1; j++){
//                    arr[j]=arr[j+1];
//                }
//                p--;
//                i--;
//            }
//        }
//        return p;
//    }
//    private static void update(int [] arr, int p, int oldvalue, int newvalue){
//        for(int i=0; i<p; i++){
//            if(arr[i]  == oldvalue){
//                arr[i]=newvalue;
//            }
//        }
//    }
//    private static int find(int [] arr,int p, int value){
//        for(int i=0; i<p; i++){
//            if(arr[i] == value){
//                System.out.println("present");
//                return p;
//            }
//        }
//        System.out.println("Not present");
//        return p;

//        int n=5;
//        int [] arr={1,2,4,5};
//        int sum=(n*(n+1)/2);
//        int sum1=0;
//        for(int i=0; i<arr.length; i++){
//            sum1+=arr[i];
//        }
//        System.out.println(sum-sum1);

//        int n=5;
//        int [] arr={1,2,3,4,5,6};
//        int sum=(n*(n+1)/2);
//        int sum1=0;
//        for(int i=0; i<arr.length; i++){
//            sum1+=arr[i];
//        }
//        System.out.println(sum1-sum);

//        int [] arr={1,2,3,4,5,6,7};
//        int left=0;
//        int right=arr.length-1;
//        while (left<right){
//            if(arr[left] % 2 != 0){
//                left++;
//            }else if(arr[right] % 2 == 0){
//                right--;
//            }else {
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,2,3,4,5,6,7};
//        int n=arr.length;
//        int m=3;
//        m=m%n;
//        for(int i=0; i<m; i++){
//            int temp=arr[0];
//            for(int j=0; j<arr.length-1; j++){
//                arr[j]=arr[j+1];
//            }
//            arr[n-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,0,0,1,1,1,0};
//        int left=0;
//        int right=arr.length-1;
//        while (left<right){
//            if(arr[left] == 0){
//                left++;
//            }else if(arr[right] == 1){
//                right--;
//            }else {
//                arr[left]=0;
//                arr[right]=1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={1,2,-3,4,3,-1,5};
//        int n= arr.length;
//        int currsum=0;
//        int maxsum=0;
//        for(int i=0; i<n; i++){
//            currsum+=arr[i];
//            if(currsum>maxsum){
//                maxsum=currsum;
//            }
//            if(currsum<0){
//                currsum=0;
//            }
//        }
//        System.out.println(maxsum);

        int [] a1={2,4,6,8,9,10,11};
        int [] a2={1,3,5,7,12};
        int n1=a1.length;
        int n2=a2.length;
        int [] a3=new int[n1+n2];
        int i=0, j=0, k=0;
        while (i<n1 && j < n2){
            if(a1[i] < a2[j]){
                a3[k]=a1[i];
                i++;
            }else {
                a3[k]=a2[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a3[k]=a1[i];
            i++;
            k++;
        }
        while (j<n2){
            a3[k]=a2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
