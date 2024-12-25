package statictostatic;

public class Pra {
	
	
	public static void main (String[]args)
	{
	Demo1.area(5);
	}
	}
	class Demo1
	{
	static void area(int r)
	{
	final double pi= 3.142;
	double res=pi*r*r;
	System.out.println(res);
	}
	}


