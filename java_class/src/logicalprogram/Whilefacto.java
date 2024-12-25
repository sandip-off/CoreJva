package logicalprogram;

public class Whilefacto {
	public static void main(String[] args) {
		int a=4;
		int fact=1;
		int factorial=1;
		while(factorial<=a)
		{
			fact=fact*a;
			a--;
		}
		System.out.println("fctorial "+fact);
	}
	
		

}
