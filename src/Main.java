import Bank.BankAccount;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the preferred account holder name: ");
        String name=sc.nextLine();

        BankAccount account1=new BankAccount();
        account1.setAccountHolder(name);
        BankAccount account2=new BankAccount();
        System.out.println(account1.toString());



    }
}