package oop.Assignment;

public class que_3 {
    public static void main(String[] args) {
          Account1 A1=new Account1();
          A1.setAccount(101, " manasvi", 12000);
          A1.withdraw(1500);
          A1.diposite(200);
          A1.displayAccountDetails();
    }
}
class Account1{
    private int AccountNo;
    private String CustName;
    private int AccountBalance;

    public void setAccount(int AccountNo, String CustName, int AccountBalance) {
        this.AccountNo = AccountNo;
        this.CustName = CustName;
        this.AccountBalance = AccountBalance;
    }

    void withdraw(double amount){
        if(amount > 0 && amount<=AccountBalance){
            AccountBalance-=amount;
            System.out.println("withdraw successful : " + AccountBalance);
        }else {
            System.out.println("invalide amount");
        }

    }
    void diposite(double amount){
        if(amount>0){
            AccountBalance+=amount;
            System.out.println("deposit successfuly : " + AccountBalance);
        }else{
            System.out.println("invalide amount");
        }
    }
    void displayAccountDetails(){
        System.out.println("AccountNo : " + AccountNo);
        System.out.println("Customer name : " + CustName);
        System.out.println("AccountBalnce : " + AccountBalance);
    }
}