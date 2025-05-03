package arraybasic;

public class averageElement {
    public static void main(String[] args) {

//        int [] arr={10, 20, 30, 40, 50};
//
//        double sum=0;
//        double avg=0;
//
//        for(int i=0; i<arr.length; i++) {
//            sum = sum + arr[i];
//            avg = sum / arr.length;
//        }
//        System.out.println(avg);
//    }
        int arr[] = {2, 5, 7, 5, 4};
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println(avg);
    }
}
