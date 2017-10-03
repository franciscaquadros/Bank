import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private int id;
    private String name;

    public List <Integer> checkingAccounts = new ArrayList<Integer>();
    public List <Integer> savingsAccounts = new ArrayList<Integer>();


    Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void createCheckingAccount(int accountNumber){
        CheckingAccount account = new CheckingAccount(accountNumber, 0);
        this.checkingAccounts.add(account.getAccountNumber());
    }

    public void createSavingsAccount(int accountNumber){
        SavingsAccount account = new SavingsAccount(accountNumber, 0);
        this.savingsAccounts.add(account.getAccountNumber());
    }




}
