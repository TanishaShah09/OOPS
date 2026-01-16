import java.util.Scanner;
/** Write a Java program that accepts two numbers as command-line arguments. Convert these arguments to appropriate numeric types (e.g., int or double), perform a simple calculation(e.g., sum or product), and print the result to the console. */

class P8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

	System.out.println("240390107046");
        System.out.print("Enter an integer number: ");
        int a = sc.nextInt();   

        System.out.print("Enter a double number: ");
        double b = sc.nextDouble();   

        double sum = a + b;

        System.out.println("First Number (int): " + a);
        System.out.println("Second Number (double): " + b);
        System.out.println("Sum = " + sum);

        sc.close();  
    }
}
