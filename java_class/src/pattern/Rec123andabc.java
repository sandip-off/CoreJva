package pattern;

public class Rec123andabc {
public static void main(String[] args) {
	
	for(int i= 1;i<=4;i++)
	{
		int no=1;
		char ch='A';
		for(int j=1;j<=4;j++)
		{
		if (i%2==1)
		{
			System.out.print(no);
			no++;
			
		}
		
		else
		{
			System.out.print(ch);
			ch++;
		}
		}
		System.out.println();
	}
	
		
}
}
