package oop.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class que_4 {
    public static void main(String[] args) {
        Student1[] stud= new Student1[5];
        stud[0] =new Student1(1, "priya", 98,89,90 );
        stud[1] =new Student1(2, "manasvi", 95, 90, 89);
        stud[2] =new Student1(3, "prinsi", 78,90,75);
        stud[3] =new Student1(4, "krushali", 75,98,76);
        stud[4] =new Student1(5, "sanju", 65,78,80);
        Student1.getTop3stud(stud);
    }
}
class Student1 {
    int RollNo;
    String Name;
    int Mark1;
    int Mark2;
    int Mark3;
    int Totalmark;
    public Student1(){}

    public static void getTop3stud(Student1[] stud) {
        for(int i=0; i<stud.length-1; i++){
            for(int j=0; j<stud.length-i-1; j++){
                if(stud[j].Totalmark < stud[j+1].Totalmark){
                    Student1 temp=stud[j];
                    stud[j]=stud[j+1];
                    stud[j+1]=temp;
                }
            }
        }
        for(int i=0; i<3; i++){
            System.out.println(stud[i].Totalmark + " " + stud[i].Name);
        }
    }
    public Student1(int RollNo, String Name, int Mark1, int Mark2, int Mark3) {
        this.RollNo = RollNo;
        this.Name = Name;
        this.Mark1 = Mark1;
        this.Mark2 = Mark2;
        this.Mark3 = Mark3;
        this.Totalmark=Mark1+Mark2+Mark3;
    }

}
