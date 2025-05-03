package oop;

public class static_que {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount("123abd", 1000, "manasvi");
        SavingAccount s2=new SavingAccount("456bca", 2000, "vansh");
        SavingAccount.printGoodMorning();
        s2.printwithname();
        System.out.println(SavingAccount.iRate);
    }
}
class SavingAccount{
    String accNo;
    double balance;
    String name;
    static double iRate;   //static variable

    public void printwithname(){ //normal method -instance level
        System.out.println("good morning" + name);
        printGoodMorning();  // can call static method from normal method
    }
    public static void printGoodMorning(){  //static method -only call static method and variables
        System.out.println("Good Morning");
        //  System.out.println(accno);   can't call non-static variable inside static method
        System.out.println(iRate);
    }
    public void displayDetails(){

        System.out.println(name +  " - " + balance);
    }
    static {   // static block to initialite static variable
        iRate=4;
    }
    public SavingAccount(String accNo, double balance, String name) {
        this.accNo = accNo;
        this.balance=balance;
        this.name=name;
    }
}
