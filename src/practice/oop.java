package practice;

public class oop {
    public static void main(String[] args) {
        student s1=new student();
        s1.setStudent(1, "manasvi", 5, 76, 80, 90);
        fees f=new fees();
        f.setFees(20000, 4, "full payment");
        s1.calculateTotalMark();
        s1.displayDetails();
        f.display();
    }
}
class student{
    int rNo;
    String name;
    int sem;
    int mark1;
    int mark2;
    int mark3;
    int totalMark;

    public void setStudent(int rNo, String name, int sem, int mark1, int mark2, int mark3) {
        this.rNo=rNo;
        this.name=name;
        this.sem=sem;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    public void calculateTotalMark() {
        this.totalMark = mark1+mark2+mark3;
    }
    void displayDetails(){
        System.out.println("RollNo " + rNo);
        System.out.println("Name " + name);
        System.out.println("Semester " + sem);
        System.out.println("Mark1 " + mark1);
        System.out.println("Mark2 " + mark2);
        System.out.println("Mark3 " + mark3);
        System.out.println("TotalMark " + totalMark);
    }
}
class fees extends student{
    int fees;
    int recipe;
    String amount;

    public void setFees(int fees, int recipe, String amount){
        this.fees=fees;
        this.recipe=recipe;
        this.amount=amount;
    }
    void display(){
        System.out.println("fees " + fees);
        System.out.println("recipe " + recipe);
        System.out.println("amount " + amount);
    }
}