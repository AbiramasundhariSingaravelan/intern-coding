package avcce.intern.demo;

class Addition
{
	float a,b;
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add()
	{
		return (int)a+b;
	}
	
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.add(5.6f, 7.6f);
		a.add(100, 200);
		a.add(100,200,300);
	}

}
