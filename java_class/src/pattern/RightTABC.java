package pattern;

public class RightTABC{
	public static void main(String[] args) {
		int space=3;
		int alpha=1;
		for(int i=1;i<=4;i++)
		{
			char ch='A';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=alpha;k++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			space--;
			alpha++;
			
		}
	}

}
