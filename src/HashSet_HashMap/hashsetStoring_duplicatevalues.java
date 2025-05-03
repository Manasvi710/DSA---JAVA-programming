package HashSet_HashMap;

import javax.management.ObjectName;
import java.util.HashSet;
import java.util.Objects;

public class hashsetStoring_duplicatevalues {
    public static void main(String[] args) {
        HashSet<student> hashSet=new HashSet<>();
        hashSet.add(new student(1, "abc"));
        hashSet.add(new student(2, "xyz"));
        hashSet.add(new student(1, "abc"));
        hashSet.add(new student(1, "abc"));
        System.out.println(hashSet.size());
    }
}
class student{
    int Rno;
    String name;

    public student(int Rno, String name) {
        this.Rno=Rno;
        this.name = name;
    }

    public boolean equals(Object a){
        if(this==a){
            return true;
        }else if(a== null || getClass() != a.getClass()){
            return false;
        }
        student stud=(student) a;
        return Objects.equals(Rno,stud.Rno) && Objects.equals(name, stud.name);
    }
    public int hashCode(){

        return Objects.hash(Rno, name);
    }
}