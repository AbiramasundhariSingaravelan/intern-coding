package avcce.intern.demo;

class Vehicle
{
	int wheels;
	
	public Vehicle(int wheels) {
		super();
		this.wheels = wheels;
	}

	void print()
	{
		if(wheels>2)
		{
			System.out.println("Four Wheeler");
		}
		else
		{
			System.out.println("Two Wheeler");
		}
	}
	
}
class Car extends Vehicle{
	int wheels;
	Car(int wheels)
	{
		super(wheels);
	}
	void print(int wheels, int mileage)
	{
		
	}
}
class Bike extends Vehicle
{
	int wheels;
	Bike(int wheels)
	{
		super(wheels);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike(2);
		b.print();
	}

}
