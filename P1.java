import java.util.Scanner;
class P1
{
    public static void main(String args[])
	{
		
                Scanner sc=new Scanner(System.in);
		float a,b=0;

		System.out.print("Enter distance(in meters):");
		a=sc.nextFloat();
		b=a*3.28084f;
		System.out.printf("Distance in feet:%.2f",b);


}
}