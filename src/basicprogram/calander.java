package basicprogram;

public class calander {
    public static void main(String[] args) {
        int d = 12354;
        System.out.println("all days  " +d);

        int y = d/365;
        System.out.println("years  " +y);

        d=d%365;
        System.out.println("extra days  " +d);

        int m = d/30;
        System.out.println("months  " +m);

        d=d%30;
        System.out.println("days  " +d);
    }
}
