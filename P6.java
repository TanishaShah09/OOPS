import java.util.Scanner;

/** Write a Java program that accepts a five-digit integer from the keyboard. Your program should then create a new number by adding one to each digit of the input number. For example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0 with a carry) */

class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("240390107046");
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        // Validate 5-digit number
        if (num < 10000 || num > 99999) {
            System.out.println("Invalid input! Please enter a 5-digit number.");
            return;
        }

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;
            int sum = digit + 1 + carry;

            result += (sum % 10) * place;
            carry = sum / 10;

            place *= 10;
            num /= 10;
        }

        System.out.println("Output: " + result);
    }
}
