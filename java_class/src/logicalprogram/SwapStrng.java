package logicalprogram;

public class SwapStrng {
	public static void main(String[] args) {
		String a="java";
		String b="mava";
	    a=a+b;
	    b=a.substring(0,b.length());
	    a=a.substring(b.length());
	    System.out.println(a);
	    System.out.println(b);
	}

}
