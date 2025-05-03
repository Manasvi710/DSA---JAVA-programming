package oop.Assignment2;

import java.util.Scanner;

public class oop_static {
    public static void main(String[] args) {
        Student[] s1= new Student[2];
        for(int i=0; i<2; i++){
            s1[i]=new Student();
            s1[i].input();
            System.out.println("student number - "+ Student.totalStudents());
            System.out.println("TotalMarks : " + s1[i].getTotalMarks());
            System.out.println("Average Marks : " + s1[i].getAverage());
            System.out.println("Highest Marks : " + s1[i].getHighest());
            System.out.println("Lowest Marks : " + s1[i].getLowest());
            System.out.println("Pass Student : " + s1[i].getPassCoun());
        }
    }
}
class Student{
    int rollNo;
    String name;
    int []marks=new int[5];
    int totalMarks;
    static int uniqueNumber=1;

//    public Student(int rollNo,String name) {
//        this.rollNo=uniqueNumber;
//        this.name = name;
//    }

    public Student() {}

    public static int totalStudents(){
     //   System.out.println(uniqueNumber);
        return uniqueNumber++;
    }
    public int getTotalMarks(){
        for(int i=0; i<marks.length; i++){
            totalMarks+=marks[i];
        }
        return totalMarks;
    }
    public  int getHighest(){
        int highest = 0;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>highest){
                highest=marks[i];
            }
        }
        return highest;
    }
    public  int getLowest(){
        int lowest = 100;
        for(int i=0; i<marks.length; i++){
            if(marks[i]<lowest){
                lowest=marks[i];
            }
        }
        return lowest;
    }
    public double getAverage(){
        double avg = 0;
        for(int i=0; i<marks.length; i++) {
            avg = totalMarks/5;
        }
        return avg;
    }

    public int getPassCoun(){
        int count=0;
        for(int i=0; i<marks.length; i++){
            if(marks[i] >= 50){
                count++;
            }
        }
        return count;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr name");
        this.name=scanner.nextLine();
        System.out.println("Eneter marks of 5 student :");
        for(int i=0; i<5; i++){
            System.out.print("Subject " + (i+1) + " - ");
            marks[i]=scanner.nextInt();
        }
    }
//    void Show(){
//         System.out.println("Roll No : " + rollNo);
//         System.out.println("Name : " + name);
//        System.out.println("Marks");
//    }
}
