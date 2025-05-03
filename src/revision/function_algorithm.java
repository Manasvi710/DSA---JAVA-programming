package revision;

import java.util.Arrays;

public class function_algorithm {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int p = 0;
//        System.out.println(isEmpty(p));
//        p=insert(arr,p,20);
//        p=insert(arr,p,30);
//        p=insert(arr,p,10);
//        p=insert(arr,p,40);
//        p=insert(arr,p,60);
//        p=insert(arr,p,50);
//        print(arr,p);
//        System.out.println();
//        System.out.println("after update");
//        update(arr, p, 20, 40);
//        print(arr,p);
//        System.out.println();
//        System.out.println("after delete");
//        p=delete(arr,p,40);
//        print(arr,p);
//        System.out.println();
//        find(arr, 10);
//
//    }
//  private static boolean isEmpty(int p){
//        if(p==0){
//            return true;
//        }
//        return false;
//  }
//  private static int insert(int []arr, int p, int value){
//        if(p==arr.length){
//            System.out.println("array is full");
//            return p;
//        }
//        int j=0;
//        while (j<p && arr[j]<value){
//            j++;
//        }
//        for(int i=p-1; i>=j; i--){
//            arr[i+1]=arr[i];
//        }
//        arr[j]=value;
//        p++;
//        return p;
//  }
//  private static void print(int [] arr, int p){
//        for(int i=0; i<p; i++){
//            System.out.print(arr[i] + " ");
//        }
//  }
//  private static void update(int []arr, int p, int oldvalue, int newvalue){
//        for(int i=0; i<p; i++){
//            if(arr[i]==oldvalue){
//                arr[i]=newvalue;
//                for(int j=0; j<p-1; j++){
//                    if(arr[j]>arr[j+1]){
//                        int temp=arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//                    }
//                }
//            }
//        }
//  }
//  private static int delete(int []arr, int p, int value){
//        for(int i=0; i<p; i++){
//            if(arr[i]==value){
//                for(int j=i; j<p-1; j++){
//                    arr[j]=arr[j+1];
//                }
//                p--;
//                i--;
//            }
//        }
//        return p;
//  }
//  private static void find(int []arr, int value){
//        int left=0;
//        int right=arr.length-1;
//        while (left<=right){
//            int mid=(left+right)/2;
//            if(arr[mid]==value){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] < value){
//                left=mid+1;
//            }else{
//                right=mid-1;
//            }
//        }
//      System.out.println("not present");
//  }
        // =================== ALGORITHM =======================


//        int[]arr={-4, -2, -1, 0, 1, 2, 5, 9};
//        int value=0;
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if(arr[mid]==value){
//                System.out.println("present");
//                return;
//            }else if(arr[mid] < value){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        System.out.println("not present");

//        int[]arr={9,5,4,2,0,-1,-4,-5};
//        int value=15;
//        int start=0;
//        int end=arr.length;
//        while (start <= end){
//            int mid = (start+end)/2;
//            if(arr[mid] == value){
//                System.out.println("present");
//                return;
//            }else if(arr[mid]>value){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        System.out.println("not present");

//        int []arr={1,4,-1,3,-2,0,1};
//        int maxsum=0;
//        int cursum=0;
//        for(int i=0; i<arr.length; i++){
//            cursum+=arr[i];
//            if(cursum >maxsum){
//                maxsum=cursum;
//            }
//            if(cursum<0){
//                cursum=0;
//            }
//        }
//        System.out.println(maxsum);


// ==============================Sorts =======================


//        int []arr={4,2,7,5,8,6,1,9,3};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={4,2,7,8,3,1,5,9,6};
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//            int minIndex=i;
//            for(int j=i+1; j<n; j++){
//                if(arr[j] < arr[minIndex]){
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

//        int [] arr={4,2,7,8,3,1,5,9,6};
//        int n=arr.length;
//        for(int i=1; i<n; i++) {
//            int j = i - 1;
//            int temp = arr[i];
//            while (j >= 0 && arr[j] > temp) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//       int arr[]={2,5,3,2,6,7,2,3,4};
//       int n=arr.length;
//       for (int i=0; i<n; i++){
//           if(arr[i]==-1){
//               continue;
//           }
//           int v=arr[i];
//           int c=0;
//           for(int j=i+1; j<n; j++){
//               if(arr[j]==v) {
//                   c++;
//                   arr[j] = -1;
//               }
//           }
//           if(c>0){
//               System.out.print(v + " ");
//           }
//       }

//        int arr[]={2,4,3,5,7,3,4,2};
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

//        int [] arr={3,7,9,10,23,4,5};
//        int max=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max2=max;
//                max=arr[i];
//            }else if(arr[i] >max2 && arr[i] > max){
//                max2=arr[i];
//            }
//        }
//        System.out.println(max + " " + max2);

//        int[] arr={5,7,20,45,10,9,4};
//        int max=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        int max3=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max3=max2;
//                max2=max;
//                max=arr[i];
//            }else if(arr[i] > max3 && arr[i] != max2 && arr[i] != max){
//                max3=arr[i];
//            }
//        }
//        System.out.println(max3);

//        int [] arr={2,5,6,4,7,8,1};
//        int sum=19;
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            if(arr[start]+arr[end] == sum){
//                System.out.println("present");
//                return;
//            }else if(arr[start]+arr[end] < sum){
//                start++;
//            }else{
//                end--;
//            }
//        }
//        System.out.println("not present");

//        int[]arr={1,0,0,1,1,1,0,1,1,0};
//        int left=0;
//        int right=arr.length-1;
//        while (left <= right){
//            if(arr[left] ==0){
//                left++;
//            }else if(arr[right] ==1){
//                right--;
//            }else {
//                arr[left] =0;
//                arr[right] =1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr={2,3,5,8,7,1,0,9,4};
//        int left=0;
//        int right=arr.length-1;
//        while (left <= right){
//            if(arr[left] % 2 == 1){
//                left++;
//            }else if(arr[right] % 2 == 0){
//                right--;
//            }else{
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int n=5;
//        int [] arr={1,2,4,5};
//        int sum=(n*(n+1))/2;
//        int sum2=0;
//        for(int i=0; i<arr.length; i++){
//            sum2+=arr[i];
//        }
//        System.out.println(sum-sum2);

//        int n=5;
//        int[]arr={1,4,3,2,5,6};
//        int sum=(n*(n+1))/2;
//        int sum2=0;
//        for(int i=0; i<arr.length; i++){
//            sum2+=arr[i];
//        }
//        System.out.println(sum2-sum);

//        int [] arr={1,2,3,4,5,6,7,8};
//        int n=arr.length;
//        int d=3;
//        d=d%n;
//        for(int i=0; i<d; i++){
//            int temp=arr[0];
//            for(int j=0; j<n-1; j++){
//                arr[j]=arr[j+1];
//            }
//            arr[n-1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr={1,2,4,6,8,10};
        int[] arr2={0,5,9,13};
        int n1=arr.length;
        int n2=arr2.length;
        int []arr3=new int[n1+n2];
        int i=0, j=0, k=0;
        while (i <n1 && j<n2){
            if(arr[i] < arr2[j]){
                arr3[k]=arr[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr3[k]=arr[i];
            i++;
            k++;
        }
        while (j<n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
