class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area;

    void calculateArea() {
        area = 0.5 * d1 * d2;
	System.out.println("240390107046");
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    double area;

    void calculateArea() {
        area = d1 * d2;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main22 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(10, 5);
        t.calculateArea();

        Rectangle r = new Rectangle();
        r.getData(10, 5);
        r.calculateArea();
    }
}