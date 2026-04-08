class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }
    void deposit(double amount) {
        balance += amount;
	System.out.println("240390107046");
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double rate = 5.0;

    void calculateInterest() {
        double interest = (balance * rate) / 100;
        System.out.println("Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 7.0;
    int time = 2;

    void maturityAmount() {
        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}
public class Main23 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Tanisha", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(102, "Rahul", 20000);
        fd.checkBalance();
        fd.maturityAmount();
    }
}