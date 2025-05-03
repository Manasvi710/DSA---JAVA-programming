package arrayFunction;

public class function {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int p=0;
        System.out.println(isEmpty(p));
        p=Insert(arr,p,10);
        p=Insert(arr,p,20);
        p=Insert(arr,p,30);
        p=Insert(arr,p,40);
        p=Insert(arr,p,30);
        p=Insert(arr,p,60);
        print(arr,p);
        System.out.println();
        System.out.println("before update--");
        print(arr,p);
        System.out.println();
        update(arr,p,30,35);
        System.out.println("after update--");
        print(arr,p);
        System.out.println();
        p=delete(arr,p,35);
        System.out.println("after delete--");
        print(arr,p);
        System.out.println();
        System.out.println("find value");
        find(arr,p,40);
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
        arr[p]=value;
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
            }
        }
    }
    private static int delete(int arr[], int p, int value){
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
    private static int find(int arr[],int p, int value) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == value) {
                System.out.println("present");
                return p;
            }
        }
        System.out.println("not Present");
        return p;
    }
}
