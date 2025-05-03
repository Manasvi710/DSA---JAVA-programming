package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class que_2_Sort {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1, "manasvi", 89));
        students.add(new Student(5, "prinsi", 70));
        students.add(new Student(3, "priya", 80));
        students.add(new Student(2, "mansi", 83));
        students.add(new Student(4, "sanju", 81));


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s1.getRno(), s2.getRno());
//            }
//        });
        Collections.sort(students);

        for(Student student: students){
            System.out.println(student);
        }
    }
}
class Student implements Comparable<Student>{
    int Rno;
    String name;
    int marks;

    public Student(int Rno, String name, int marks) {
        this.Rno=Rno;
        this.name=name;
        this.marks = marks;
    }

    public int getRno() {
        return Rno;
    }

    public void setRno(int rno) {
        Rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int compareRno=((Student)o).getRno();
        return this.Rno-compareRno;
    }

    @Override
    public String toString() {
        return Rno + " " + name + " " + marks;
    }
}