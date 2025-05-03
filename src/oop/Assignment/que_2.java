package oop.Assignment;

public class que_2 {
    public static void main(String[] args) {
       account a1= new account();
       a1.setaccountDetails(1, " dwhcda", 12000, 2);
       a1.calculateInterest();
       a1.displayAccountDetails();
    }
}
class account {
    private int accountNumber;
    private String custName;
    private double balance;
    private double InterestRate;

    public void setaccountDetails(int accountNumber, String custName, double balance, double InterestRate){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
        this.InterestRate=InterestRate;
    }
    void calculateInterest(){
        double rate = balance*InterestRate/100;
        balance+=rate;
    }
    void displayAccountDetails(){
        System.out.println("AccountNumber : " + accountNumber);
        System.out.println("Customer Name : " + custName);
        System.out.println("Balance : " + balance);
        System.out.println("InterestRate : " + InterestRate);
    }
}