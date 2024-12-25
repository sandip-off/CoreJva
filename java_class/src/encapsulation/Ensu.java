package encapsulation;

class Start
{
	
	private int pin =2255;
	
	public int get()
	{
		return pin;
	}
	public void set(int pin)
	{
		this.pin =pin;
	}
}

public class Ensu {
	public static void main(String[] args) {
		Start s=new Start();
	System.out.println(s.get());
	s.set(5432);
	System.out.println(s.get());
		
	}

}
