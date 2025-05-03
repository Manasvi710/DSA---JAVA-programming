package arraybasic;

public class duplicateOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 6};
        int n = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.print("duplicate");
        } else {
            System.out.println("not duplicate");
        }
    }
}
