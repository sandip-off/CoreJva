package logicalprogram;

public class Fetch_Num_Char {
public static void main(String[] args) {
	String s= "Qspider123@gmail.com";
	String alpha="";
	String num="";
	String Spcl="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			alpha=alpha+ch
;
			
		}
		else if(Character.isDigit(ch))
		{
			num=num+ch;
			
			
		}
		else
		{
			Spcl=Spcl+ch;
		}
	}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(Spcl);
}
}
