package Ref;
class Swiggy
{
void order()
{
System.out.println("your order is ready ");

}

}
class cus1{
	static void hungry(Swiggy h1)
	{
		h1.order();
		
	}
	
}
public class Reference {
	public static void main(String[] args) {
		Swiggy s=new Swiggy();
		cus1.hungry(s);
		
		
	}

}
