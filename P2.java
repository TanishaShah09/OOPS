import java.util.Scanner;
class P2
{
    public static void main(String args[])
	{
		System.out.print("Enter Distance(in meters):");
                Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f,D,Dx,Dy,x,y;

		System.out.print("Enter a:");
		a=sc.nextInt();
		System.out.print("Enter b:");
		b=sc.nextInt();
		System.out.print("Enter c:");
		c=sc.nextInt();
		System.out.print("Enter d:");
		d=sc.nextInt();
		System.out.print("Enter e:");
		e=sc.nextInt();
		System.out.print("Enter f:");
		f=sc.nextInt(); 
		D=a*d-b*c;
		Dx=e*d-d*f;
		Dy=a*f-c*e;
		if(D==0){
			System.out.println("Arithmetic Exception");
		}else{
		x=Dx/D;
		y =Dy/D;  
		System.out.println("x="+x);
		System.out.println("y="+y  );
		}

	}

}