package oop;

public class Interface_Abstraction {
    public static void main(String[] args) {

    }
}
interface Bank2{ //100% abstraction  - All method are by default abstract and public
    static final int noOfDays=7;

    void printInterest();
    //after java 7, since java 8
    static void printHello(){ //interest can have static method and public
        System.out.println("hello");
    }
    default void printGoodMorning(){  //interface can have default method with body
        System.out.println("Good Morning");
    }
}
class sbi implements Bank2{
    public void printInterest(){  //implementing abstract method of interface bank
        System.out.println(4);
    }
}
//interface A{
//    static void printGoodMorning(){
//        System.out.println("Good");
//    }
//}
//interface B{
//    static void printGoodMorning(){
//        System.out.println("Good MvMv");,
//    }
//    class c implements A,B{
//
//    }
//}