package oop;

public class super_keyWord {
    public static void main(String[] args) {
        student1 s1=new student1(20, "manasvi", 1, 4);
    }
}
class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
}
class student1 extends Person{
    private int rollNo;
    private int sem;

    student1(int age, String name, int rollNo, int sem) {
        super(age, name); // calling parent class constructor
        this.rollNo=rollNo;
        this.sem=sem;
    }
}