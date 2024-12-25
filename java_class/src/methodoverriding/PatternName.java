package methodoverriding;

public class PatternName {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			System.out.print("*");			
		}
		
		for(int i=1;i<=4;i++)
		{
			System.out.println("*");
			
		}
		for(int i=1;i<=4;i++)
		{
			System.out.print("*");			
		}
		
		for(int j=1;j<=4;j++)
		{
		
		
		for(int i=1;i<=3;i++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=1;i++)
		{
			System.out.println("*");
		}
		}
	}

}
