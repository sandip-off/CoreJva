package Constructor;

public class WithoutThis {
	
		String a;
		int b;
		WithoutThis(String x,int y)
		{
			a=x;
			b=y;
			
			
		}
		public static void main(String[] args) {
		Thiskbrd t=new Thiskbrd("sandip",20);
		
		System.out.println(t.a+" "+t.b);
			
		}
}
				

	


