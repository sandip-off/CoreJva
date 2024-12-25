package logicalprogram;

public class Perfect {
public static void main(String[] args) {
	//for strong sum of divisible is equal
	int no=6;
	int sum=0;
	for(int i=1;i<no;i++)
	{
		if (no%i==0)
		{
			sum=i+sum;
			
		}
		
	}
	if (no==sum)
	{
		System.out.println("its a perfect no ");
	}
	
}
}
