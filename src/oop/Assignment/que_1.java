package oop.Assignment;

public class que_1 {
    public static void main(String[] args) {
         student s1=new student();
         s1.setStudDetails(1, "manasvi", 40, 45, 47);
         s1.calculateTotal();
         s1.displayStudDetails();
    }
}
class student {
    private int rollNum;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalmark;

    public void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void calculateTotal(){

        this.totalmark = mark1 + mark2 + mark3;
    }
    void displayStudDetails(){
        System.out.println("Roll Number : " + rollNum);
        System.out.println("Student Name : " + studName);
        System.out.println("Mark1 : " + mark1);
        System.out.println("Mark2 : " + mark2);
        System.out.println("Mark3 : " + mark3);
        System.out.println("total marks : " + totalmark);
    }
}
