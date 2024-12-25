package statictononstatic;

public class Ret {
	
	
	public static void main (String[]args)
	{
	//double x=new Demo2().area(4,5);
		Demo2 d=new Demo2();
		double x=d.area(4, 5);
	System.out.println(x);

	}
	}
	class Demo2
	{
	double area(int b, int h)
	{
	double res=0.5*b*h;
	return res;
	}
	}


