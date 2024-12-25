package logicalprogram;

public class Pallindrom {
	public static void main(String[] args) {
		
	
	int a=121;
	int copy=a;
	int re=0;
	while(a!=0)
	{
	int rem =a%10;
	re=re*10+rem;
	a=a/10;
		
	}
	System.out.println(re);
	}
}
