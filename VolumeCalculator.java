import java.util.Scanner;

class VolumeCalculator {

    // Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Sphere
    double calculateVolume(float radius) {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

	System.out.println("240390107046");
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + obj.calculateVolume(side));

        System.out.print("Enter length, width, height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + obj.calculateVolume(l, w, h));

        System.out.print("Enter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.println("Volume of Sphere: " + obj.calculateVolume(r));
    }
}