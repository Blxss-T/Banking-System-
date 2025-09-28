package Bank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private  double balance;
    private int accountNumber;
    private String accountHolder;
    private static int counter = 1000;
    List <String> transactions =new ArrayList<>();
    private double dailyLimit = 50000;

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

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = counter++;
        this.transactions = new ArrayList<>(); // start empty
    }
    public void deposit (double depoAmmount){
        balance+=depoAmmount;
        transactions.add("Deposited " + depoAmmount + " FRW on " + LocalDate.now());
    }
    public void withdraw (int withAmmount){
        if(withAmmount<=balance) {
            balance-= withAmmount;
            transactions.add("Withdrew " + withAmmount + " FRW on " + LocalDate.now());
        }else{
            System.out.println("Your balance is short");
        };
    }
    public void bankTransit(int ammount, BankAccount receiver){

        if(balance >=0){
            balance-=ammount;
            receiver.balance +=ammount;
            System.out.println("Transfer successfull");
            transactions.add("Transferred " + ammount + " FRW to account " + receiver.getAccountNumber() + " on " + LocalDate.now());
        }else{
            System.out.println("Your balance is insufficient.Please deposit more to transfer.");
        }


    }
    public void applyInterest(double rate) {
        double interest = balance * (rate / 100);
        balance += interest;
    }
    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String t : transactions) {
                System.out.println("- " + t);
            }
        }
    }
    public void withdraw(double amount) {
        if (amount > dailyLimit) {
            System.out.println("Withdrawal failed: exceeds daily limit of " + dailyLimit + " FRW");
        } else if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew " + amount + " FRW on " + LocalDate.now());
        } else {
            System.out.println("Your balance is short");
        }
    }
    public String toString(){
        return "{ Account Holder: "+getAccountHolder()+ ",\n" +
                "Account Number: "+getAccountNumber()+",\n"+
                "Balance: "+getBalance()+"}";


    }

}
