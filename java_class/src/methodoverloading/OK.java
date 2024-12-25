package methodoverloading;

public class OK {
	void disp(String b)
	{
		System.out.println("its good to see you  "  +  b);
		
	}
	void disp(int a)
	{
		System.out.println(a);
		
	}
public static void main(String[] args) {
	OK o=new OK();
	o.disp("hi");
	o.disp(10 );
	
	
	
}
	
	
	
}
