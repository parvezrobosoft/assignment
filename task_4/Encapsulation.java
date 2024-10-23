package task_4;

class BankAccount
{
    private int accountNumber;
    private int balance;
    static int num=1234;

    BankAccount()
    {
        accountNumber=num;
        num++;
    }

    public void deposit(int amount)
    {
        balance+=amount;
        checkBalance();
    }

    public void withdraw(int amount)
    {
        balance-=amount;
        checkBalance();
    }
    public void checkBalance()
    {
        System.out.println("Account number: "+accountNumber +"    "+"Balance= "+balance);
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount emp1 =new BankAccount();
        emp1.checkBalance();
        emp1.deposit(1000);
        emp1.withdraw(500);

        System.out.println("");
        BankAccount emp2 =new BankAccount();
        emp2.checkBalance();
        emp2.deposit(3000);
        emp2.withdraw(200);

    }
}
