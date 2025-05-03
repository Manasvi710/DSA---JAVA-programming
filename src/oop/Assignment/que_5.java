package oop.Assignment;

public class que_5 {
    public static void main(String[] args) {
        Holiday[] holidays=new Holiday[3];
        holidays[0]=new Holiday("repDay", 26, "january");
        holidays[1]=new Holiday("uttrayan", 14, "january");
        holidays[2]=new Holiday("IndDay", 15, "augest");
        System.out.println(holidays[0].inSameMonth(holidays[1]));
        Holiday.avgDate(holidays);
    }
}
class Holiday{
    String name;
    int day;
    String month;

    public Holiday(String name, int day, String month) {
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public boolean inSameMonth(Holiday h){
        if(this.month.equals(h.month)){
            return true;
        }
        return false;
    }
    public static void avgDate(Holiday[] holidays){
        double avg;
        double sum=0;
        for(int i=0; i<holidays.length; i++){
            sum+=holidays[i].day;
        }
        avg=sum/holidays.length;
        System.out.println("Avg Date" + " - " + avg);
    }
}
