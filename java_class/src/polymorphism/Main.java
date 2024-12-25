package polymorphism;
class Ms_Office
{
	void disp()
	{
		System.out.println("some files");
		
	}
	
}
class Word extends Ms_Office
{
	void disp()
	{
		System.out.println("word file is dislayed");
		
	}
}
class Excel extends Ms_Office
{
void disp()
{
	System.out.println("Excel file is displayed");
}
}
class Medem 
{
static void mm(Ms_Office m)
{
	m.disp();
}
}

public class Main {
	public static void main(String[] args) {
		Excel m=new Excel();
		Medem.mm(m);
		Word w=new Word();
		Medem.mm(w);
		
		
	}

}
