public class BankAccount {
    protected double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("Deposit in BankAccount; "+amount);
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw in BankAccount:"+amount);
        } else {
            System.out.println("Insufficient balance in BankAccount.");
        }
    }
}
