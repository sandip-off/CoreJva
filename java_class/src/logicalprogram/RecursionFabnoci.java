package logicalprogram;

public class RecursionFabnoci {
	static int fib1=0;
	static int fib2=1;
	static int count=1;

	public static void main(String[] args) {
		System.out.print(fib1+" "+fib2+" ");
		pass();

	}

	 static void pass() {
		if(count<=5)
		{
			int fib3=fib2+fib1;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			count++;
			pass();
			
		}
		
	}

}
