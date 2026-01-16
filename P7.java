import java.util.Scanner;

/** Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the area of the triangle. Ensure that the program validates if the given side lengths can actually form a triangle (sum of any two sides must be greater than the third side) before calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2) */

class P7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, s, area;

	System.out.println("240390107046");
        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area = %.2f", area);
        } else {
            System.out.println("Invalid values.");
        }

        sc.close();
    }
}
