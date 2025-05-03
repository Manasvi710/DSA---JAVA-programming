package oop;

public class que_1 {
    public static void main(String[] args) {
        Student s1=new Student(1,  "Manasvi",  20);
        Student s2=new Student();
        s1.setPerc(80.3);
        Student s3=new Student(s1);
        System.out.println(s1.getrNo());
    }
}
class Student{
    private int rNo;            //private access modifier
    private String name;
    private int age;
    private double perc;

    Student(){}                  //default constructor

    Student(int rNo, String name, int age){      //perameterised constructor
        this.rNo=rNo;
        this.name=name;
        this.age=age;
    }
    Student(Student oldStudent){   // copy constructor
        this.rNo=oldStudent.rNo;
        this.name=oldStudent.name;
        this.age=oldStudent.age;
        this.perc=oldStudent.perc;
    }

    public void setPerc(Double perc){      //setter mathod
        this.perc=perc;
    }
    public int getrNo(){                  //getter mathod

        return rNo;
    }
}
