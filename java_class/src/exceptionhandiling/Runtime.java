package exceptionhandiling;

public class Runtime {
	public static void main(String[] args) {
		String s="hell0";
		String e=s.toUpperCase();
		String rev="";
		
		
		for(int i=e.length()-1;i>=0;i--)
		{
			rev=rev+e.charAt(i);
			
			
			
		}
		
		System.out.println(rev.charAt(3));
	}

}
