package statictostatic;


	class Circle_Call
	{
	public static void main (String[]args)
	{
	Demo.area();
	}
	}
	class Demo
	{
	static void area()
	{
	final double pi= 3.142;
	int r=5;
	double res=pi*r*r;
	System.out.println(res);
	}
	}


