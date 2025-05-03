package oop;

public class inheritance_Example {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="manasvi";
        System.out.println(s1.getName());
    }
}
class person{
    String name;
    int age;
    String contect;

    public String getName(){
        return name;
    }
}

class Employee extends person{
    int empId;
    int salary;
}
class student extends person{
    int rNo;
    int sem;
}

class prof extends Employee{
    String subjects;
}
