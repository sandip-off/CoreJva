package statictostatic;

public class ret 
{
	
	
	public static void main (String[]args)
	{
	double  x=Dem.area();
	System.out.println(x);
	}
	}
	class Dem
	{
	static double area()
	{
	int r=5;
	final double pi= 3.142;
	double res=pi*r*r;
	return res;
	}
	
}
