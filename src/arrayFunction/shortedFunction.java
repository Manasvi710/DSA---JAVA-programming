package arrayFunction;

public class shortedFunction {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int p=0;
        System.out.println(isEmpty(p));
        p=Insert(arr,p,10);
        p=Insert(arr,p,50);
        p=Insert(arr,p,40);
        p=Insert(arr,p,30);
        p=Insert(arr,p,20);
        print(arr,p);
        System.out.println();
        update(arr,p,40,60);
        System.out.println("after update");
        print(arr,p);
        System.out.println();
        p=delete(arr, p, 20);
        System.out.println("after delete");
        print(arr,p);
        System.out.println();
        find(arr, 20);

    }
    private static boolean isEmpty(int p){
        if(p==0){
            return true;
        }
        return false;
    }

    private static int Insert(int arr[], int p, int value){
        if(p==arr.length){
            System.out.println("array is full");
            return p;
        }
           int j=0;
        while(j < p && arr[j]<value){
            j++;
        }
        for(int i=p-1; i>=j; i--){
            arr[i+1]=arr[i];
        }
        arr[j]=value;
        p++;
        return p;
    }
    private static void print(int arr[], int p){
        for(int i=0; i<p; i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static void update(int arr[], int p, int oldvalue, int newvalue){
           for(int i=0; i<p; i++){
               if(arr[i]==oldvalue){
                   arr[i]=newvalue;
                   for(int j=0; j<p-1; j++){
                       if(arr[j]>arr[j+1]){
                           int temp=arr[j];
                           arr[j]=arr[j+1];
                           arr[j+1]=temp;
                       }
                   }
               }
           }
    }
    private static int delete(int []arr, int p, int value){
        for(int i=0; i<p; i++){
            if(arr[i]==value){
                for(int j=i; j<p-1; j++){
                    arr[j]=arr[j+1];
                }
                p--;
                i--;
            }
        }
        return p;
    }
    private static void find(int arr[],int value){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left <= right){
            int mid=(left+right)/2;
            if(arr[mid]==value){
                System.out.println("present");
                return;
            }else if(arr[mid]<value){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("not present");
    }
}
