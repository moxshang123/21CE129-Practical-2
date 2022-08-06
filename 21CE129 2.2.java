//Program created by Moxshang shah 21CE129
import java.util.Date;

class Account
{
   //Declaring required variables for class account
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    public Account()//Default Constructer
    {
        id=0;
        balance=500;
        annualInterestRate=7;
    }
   //Parameterized Constructer
    public Account(int newId, double newBalance)
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=0.07;
    }
    public  Account(int newId, double newBalance, double newAnnualInterestRate)
    {
        id=newId;
        balance=newBalance;
        annualInterestRate=newAnnualInterestRate;
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setId(int newId)//Accessor method
    {
        id=newId;
    }
    public void setBalance(int newBalance)
    {
        balance=newBalance;
    }
    public void setAnnualInterestRate(int newAnnualInterestRate)//mutator method
    {
        annualInterestRate =newAnnualInterestRate;
    }
    public void setDateCreated(Date newDateCreated)
    {
        dateCreated= newDateCreated;
    }
    double getMonthlyInterestRate()
    {
        return(annualInterestRate/12);
    }
    double getMonthlyInterest()
    {
        return(balance*(annualInterestRate/12));
    }
    public java.util.Date getDate()
    {
        return this.dateCreated;
    }
    double Withdraw(double amount)//Logic of  withdrawing
    {
        if(balance-amount < 0)
        {}
        else
        {
            balance-=amount;
        }
        return balance;
    }
    double Deposit(double amount)
    {
        return balance+=amount;
    }
}

public class Bank {
    public static void main(String[] args)
    {
        //declaring class bank variables
        Account A1 = new Account();
        System.out.println("ID : " + A1.getId());
        System.out.println("Balance: "+ A1.getBalance());
        System.out.println("Annual Interest Rate: "+ A1.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate: " +A1.getMonthlyInterestRate());
        System.out.println("Monthly Interest: " +A1.getMonthlyInterest());
        System.out.println("Date: " + A1.getDate());
        System.out.println("Balance after withdraw: "+A1.Withdraw(250));
        System.out.println("Balance after deposit: "+A1.Deposit(120));

    }
}
