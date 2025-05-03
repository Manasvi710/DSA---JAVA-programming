package oop;

public class aggregation_HAS_A {
    public static void main(String[] args) {
        //Aggregation  - HAS-A relation
        Student1 s=new Student1(1, "manasvi", "10", "atlanta", "surat");
        System.out.println(s.address.city);
    }
}
class Address{
    String hNo;
    String sco;
    String city;
     public Address(String hno, String sco, String city){
         this.hNo=hno;
         this.sco=sco;
         this.city=city;
     }
}
class Student1 {
    int rNo;
    String name;
    Address address;

    public Student1 (int rNo, String name, String hNo, String sco, String city){
        this.rNo=rNo;
        this.name=name;
        this.address=new Address(hNo, sco, city);
    }
}
