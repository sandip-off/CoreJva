package generic;

public class Wrapper {
	public static void main(String[] args) {
		//boxing
		int a=10;
		//Integer x=new Integer(a); don't use this 
		Integer.valueOf(a);
	    System.out.println(a);
		//unboxing
		Integer x=new Integer(10);
		int y=x;
		System.out.println(y);
		
	}

}
