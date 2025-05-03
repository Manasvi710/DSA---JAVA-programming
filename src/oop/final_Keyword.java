package oop;

public class final_Keyword {
    public static void main(String[] args) {
        int a=10;
        final int noOfDaysInWeek=7;  // if variable is final you can't change its value
        System.out.println(noOfDaysInWeek);
    }
}
final class Bank1{  //if class is final , you can't extend
    final public void PrintInterest(){ //if method is final you can't override

        System.out.println(4);
    }
}
// class SBI extends Bank1{ // error
//  @Override
//       public void printInterest() { // error
//        System.out.println(5);
//    }
//}