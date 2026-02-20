class BankAccount18 {
    
    String account_holder_name;
    double balance;
    static double interest_rate = 7.0;    
       
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }
    
    void displayInterest() {
	System.out.println("240390107046");
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }
    
        static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }
}

class Main18 {
    public static void main(String[] args) {
        
        BankAccount18 acc1 = new BankAccount18();
        acc1.account_holder_name = "Tanisha";
        acc1.balance = 100000;
        
        BankAccount18 acc2 = new BankAccount18();
        acc2.account_holder_name = "Hardik";
        acc2.balance = 120000;
        
        acc1.displayInterest();
        acc2.displayInterest();
        
        BankAccount18.updateInterestRate(8.0);
        
        System.out.println("After Updating Interest Rate:\n");
        
        acc1.displayInterest();
        acc2.displayInterest();
    }
}