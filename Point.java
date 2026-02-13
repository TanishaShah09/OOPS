import java.util.Scanner;

class Point {
    int x;
    int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.print("Default Constructor Output: ");
        p1.display();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.print("Parameterized Constructor Output: ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Copy Constructor Output: ");
        p3.display();

        sc.close();
    }
}
