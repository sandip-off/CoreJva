package polymorphism;

  public class Runtime {
	 public static void main(String[] args) {
		 Word1 w= new Word1();
		Med.mxm(w);
		 Excel1 e=new Excel1();
		 
		 Med.mxm(e);
		
	}

}
 class Med
 {
	 static void mxm(Ms w)
	 {
		 
		w.file();
	 }
	 
	 
	 
 }
class Ms
{
	void file()
	{
		System.out.println("some files");
		
	}
}
class Word1 extends Ms
{
	void file()
	{
System.out.println("only word file is opened");
	}
}

class Excel1 extends Ms
{
	void file()
	{
		
		System.out.println("all excel file");
	}
}
	