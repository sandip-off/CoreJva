package logicalprogram;

public class Strongcall {
	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum +factorial(rem);
			no=no/10;
			
			
		}
		if (copy==sum)
		{
			System.out.println(copy+" is a strong num");
		}
		
		
	}
	static int factorial(int n)
	{
		
		int fact=1;
		for (int i=n;i>=1;i--)
		{
			
			fact=fact*i;
		}
		return fact;
	}
	

}
