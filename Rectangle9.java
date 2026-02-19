import java.util.Scanner;

/*Practical 9

Problem Statement:
Define a Java class named Rectangle. It should have two double data fields: width and height,
both with a default value of 1. Implement a no-argument constructor and a constructor that
takes width and height as parameters. Include methods getArea() and getPerimeter() that
return the calculated area and perimeter respectively.*/

class Rectangle9
{

    double width;
    double height;

    Rectangle(double w, double h) 
	{
        	width = w;
       		height = h;
    	}

       void getArea() 
	{
        System.out.println("Area of Rectangle = " + (width * height));
    	}

	void getPerimeter() 
	{
        System.out.println("Perimeter of Rectangle = " + (2 * (width + height)));
    	}

        public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
	
	System.out.println("240390107046");
        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w, h);

        r.getArea();
        r.getPerimeter();

        sc.close();
    }
}
