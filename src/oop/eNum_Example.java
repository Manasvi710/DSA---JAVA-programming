package oop;

public class eNum_Example {
    public static void main(String[] args) {
        Holiday h1=new Holiday("Rday", 26, MonthEnums.January);
        Holiday h2=new Holiday("Uttrayn", 14, MonthEnums.January);
        Holiday h3=new Holiday("Holi", 25, MonthEnums.March);
        System.out.println(h1.inSameMonth(h2));
    }
}
class Holiday{
    String name;
    int day;
    MonthEnums month;

    public Holiday(String name, int day, MonthEnums month) {
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
}