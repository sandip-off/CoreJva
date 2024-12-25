package methodoverriding;


class Facebook
{
void story()
{
	System.out.println("only text");
}
}
class F1 extends Facebook
{
void story()
{
	System.out.println("along with photo");
}
}
class F2 extends Facebook
{
	void story()
	{
		super.story();
		System.out.println("vedio as well");
	}
}
public class Over {
public static void main(String[] args) {
	Facebook n=new F2();
	n.story();
	
}
}
