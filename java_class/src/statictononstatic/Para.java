package statictononstatic;

public class Para {
	
	
	public static void main (String[]args)
	{
	//new Demo().area(4,5);
	Demo1 d= new Demo1();
	d.area(4, 5);
	}
	}
	class Demo1
	{
	void area(int b, int h)
	{
	double res=0.5*b*h;
	System.out.println(res);
	}
	}


