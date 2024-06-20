 class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double balance, double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    @Override
     public void deposit(double amount){
        super.deposit(amount);
        System.out.println("Depisit in SavingsAccount with interest."+amount);
     }
     @Override
     public void withdraw(double amount){
        super.withdraw(amount);
        System.out.println("Withdraw from SavingsAccount:"+amount);
     }

     public void addInterest(){
        double interest=balance*interestRate /100;
        deposit(interest);
     }
}
