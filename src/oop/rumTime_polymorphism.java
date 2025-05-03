package oop;

import java.awt.*;
import java.util.Scanner;

public class rumTime_polymorphism {
    public static void main(String[] args) {
        //Run time - ( method override )
         Bank bank;
         int Choice;
        Scanner sc=new Scanner(System.in);
        Choice=sc.nextInt();
        if(Choice == 1){
            bank=new SBI();
        }else{
            bank=new Kotak();
        }
        bank.printInterestRate();
    }
}
class Bank{
    String cusName;
    double balance;
    int accNo;

    public void printInterestRate(){
        System.out.println(4);
    }
}
class SBI extends Bank{

}
class Kotak extends Bank{
    @Override
    public void printInterestRate() {
        System.out.println(5);
    }
}