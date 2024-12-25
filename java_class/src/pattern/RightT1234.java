package pattern;

public class RightT1234 {
	public static void main(String[] args) {
		
	
	int space=4;
	int no=1;
    int x=1;
	for(int i=1;i<=4;i++)
	{
		for (int j=1;j<=space;j++)
		{
			System.out.print(" ");
			
		}
		for(int k =1;k<=no;k++)
		{
			
			System.out.print(x);
			x++;
		}
		System.out.println();
		space--;
		no++;
	}
	}
}
