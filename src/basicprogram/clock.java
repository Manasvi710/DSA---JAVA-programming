package basicprogram;

public class clock {
    public static void main(String[] args) {
        int s = 12342;
        System.out.println("all seconds  "+ s);

        int h = s/3600;
        System.out.println("hours  "+h);

        s=s%3600;
        System.out.println(s);

        int m = s/60;
        System.out.println("minutes  "+m);

        s = s%60;
        System.out.println("seconds  "+s);
    }
}
