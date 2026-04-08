import java.util.Scanner;
// Superclass
class Payment {
    public void processPayment(int amount) {
        System.out.println("240390107046");
	System.out.println("Processing payment of Rs. " + amount);
    }
}
// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}
// Subclass 2
class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}
public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        Payment p; // reference of superclass

        if (choice == 1) {
            p = new CreditCardPayment(); // upcasting
        } else if (choice == 2) {
            p = new UPIPayment(); // upcasting
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Method overriding call
        p.processPayment(amount);

        sc.close();
    }
}