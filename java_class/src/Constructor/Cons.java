package Constructor;

public class Cons  extends Object{
	int a;
	String b;
	boolean c;
	Cons(int a,String b, boolean c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		
		
	}
	public static void main(String[] args) {
		Cons c1=new Cons(10,"bebe",false);
		System.out.println(c1.a);
		
		
		
		
	}

}
