class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
	System.out.println("240390107046");
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void searchAccount(BankAccount[] accounts, String id) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(id)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("A101", "Tanisha", 5000);
        accounts[1].assignValues("A102", "Riya", 7500);
        accounts[2].assignValues("A103", "Aman", 6200);
        accounts[3].assignValues("A104", "Neha", 8800);
        accounts[4].assignValues("A105", "Karan", 4300);

        System.out.println("All Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        System.out.println("Searching for account A103:");
        searchAccount(accounts, "A103");
    }
}
