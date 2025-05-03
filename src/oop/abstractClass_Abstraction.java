package oop;

public class abstractClass_Abstraction {
    public static void main(String[] args) {
      // bank b=new bank();  // you can't create object of abstract class
    }
}
abstract class bank{  //0 to 100 % abstraction
    int accNo;
    String custName;

    public void printHello(){
        System.out.println("Hello");
    }
    abstract public void printInterest();
}
class SBI1 extends bank{
    public void printInterest(){  //method of parent class implementation of abstract
        System.out.println(4);
    }
}