package Bank;
import java.util.Random;

public class BankAccount {
    private  double balance;
    private int accountNumber;
    private String accountHolder;
    private static int counter = 1000;

    public BankAccount(){};
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public void setAccountNumber(int accountNumber ){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAccountHolder(String accountHolder ) {
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountHolder){
        this.accountHolder=accountHolder;
        this.balance=0;
        this.accountNumber=counter++;
    }
    public void deposit (double depoAmmount){
        balance+=depoAmmount;
    }
    public void withdraw (int withAmmount){
        if(withAmmount<=balance) {
            balance-= withAmmount;
        }else{
            System.out.println("Your balance is short");
        };
    }
    public void applyInterest(double rate) {
        double interest = balance * (rate / 100);
        balance += interest;
    }
    public String toString(){
        return "{ Account Holder: "+getAccountHolder()+ ",\n" +
                "Account Number: "+getAccountNumber()+",\n"+
                "Balance: "+getBalance()+"}";
    }

}
