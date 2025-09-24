package Bank;

public class BankAccount {
    private  int balance;
    private int accountNumber;
    private String accountHolder;
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
    public int getBalance(){
        return this.balance;
    }
    public void setAccountHolder(String accountHolder ) {
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountHolder,int balance,int accountNumber){
        this.accountHolder=accountHolder;
        this.balance=0;
        this.accountNumber=accountNumber;
    }
    public int deposit (int depoAmmount){
        return this.getBalance()+ depoAmmount;
    }
    public int withdraw (int withAmmount){
        return this.getBalance()+ withAmmount;
    }
    public String toString(){
        return "{ Account Holder: "+getAccountHolder()+ ",\n" +
                "Account Number: "+getAccountNumber()+",\n"+
                "Balance: "+getBalance()+"}";
    }

}
