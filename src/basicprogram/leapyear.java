package basicprogram;

public class leapyear {
    public static void main(String[] args) {
        int year = 1900;
        //boolean leap = false;
        if (year % 4 == 0) {
            System.out.println("leap year  " + year);
        } else
            System.out.print("not leap year  " + year);
    }
}
