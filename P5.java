import java.util.Scanner;

/** Problem Statement: Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), Calculate and display the minimum number of currency notes of denominations 100, 50, 10, 5, 2, and 1 that would be given to the user. */

class P5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
	System.out.println("240390107046");
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int n100 = amount / 100;
        amount = amount % 100;

        int n50 = amount / 50;
        amount = amount % 50;

        int n10 = amount / 10;
        amount = amount % 10;

        int n5 = amount / 5;
        amount = amount % 5;

        int n2 = amount / 2;
        amount = amount % 2;

        int n1 = amount;

        System.out.println("100 Rs Notes = " + n100);
        System.out.println("50 Rs Notes  = " + n50);
        System.out.println("10 Rs Notes  = " + n10);
        System.out.println("5 Rs Notes   = " + n5);
        System.out.println("2 Rs Notes   = " + n2);
        System.out.println("1 Rs Notes   = " + n1);
    }
}
