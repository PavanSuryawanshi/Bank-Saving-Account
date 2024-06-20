public class BankDemo {
    public static void main(String[] args) {
        SavingAccount savings= new SavingAccount(1000,5);
        savings.deposit(200);
        savings.withdraw(100);
        savings.addInterest();
    }
}
