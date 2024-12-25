package upanddowncasting;
class sample{
	void test()
	{
		System.out.println("i am test ");
		
		
	}

	
}
class Demo extends sample
{
	void disp()
	{
		System.out.println("iam disp");
		
	}
	
}


public class Upanddown {

	public static void main(String[] args) 
	{
		//upcasting
		sample s=new Demo();
		s.test();
		//down casting
		Demo x=(Demo)s;
		x.disp();
		
      
	}

}
