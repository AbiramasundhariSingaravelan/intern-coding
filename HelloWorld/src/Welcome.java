import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("JAVA");
		int a,b,c;
		System.out.println("Enter value for A: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter value for B: ");
		b=s.nextInt();
		c=a+b;
		System.out.println("Result of Addition: ");
		System.out.println(c);
	
		double x,y,z;
		System.out.println("Enter value for x:");
		Scanner w=new Scanner(System.in);
		x=w.nextDouble();
		System.out.println("Enter the value for y:");
		y=w.nextDouble();
		z=x/y;
		System.out.println("Enter the division value:"+z);
		//classname objname;
	}

}

//return_type function_name(arguments)
//int
//float
//Syatem Class
//output => out
//Input => in
//println()
//object -> Real time entity
