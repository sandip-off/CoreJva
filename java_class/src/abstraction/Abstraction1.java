package abstraction;




 interface File_page

{
 public abstract void  file ();
}
class Image_file implements File_page
{
	public void file()
	{
		System.out.println("photos were displyed when clicked to imagefile");
	}

}
class Text_file implements File_page
{
	public  void file()
	{
		System.out.println("text files is displayed when clicked on text file");
	}
}
class Vedio_file implements File_page
{
	public void file()
	{
	System.out.println("vedioes files is displayed when clicked in text file");
	}
}
class Formats
{
	public static void meanu(File_page a1)
	{
		a1.file();
	}
}
 class Abstraction1 
{

	public static void main(String[] args) 
	{
		Image_file i1 = new  Image_file();
		Formats.meanu(i1);
		Text_file t1=new Text_file();
		
		Formats.meanu(t1);
		Vedio_file v1=new Vedio_file();
		Formats.meanu(v1);
	

	}
	//hiding the complicity of the system and exposing the required functionality to the end user
	//to achive user friendlyness and provide security for the code 
	//real time example upi creditcard diffrenthig can be achive
	

}


