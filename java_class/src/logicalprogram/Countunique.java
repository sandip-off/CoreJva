package logicalprogram;

import java.util.ArrayList;


//count dublicates
public class Countunique {
	public static void main(String[] args) {
		int value=0;
		String s="helllo";
		char [] ch=s.toCharArray();
		ArrayList<Character> h=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(!h.contains(ch[i]))
			{
				
				h.add(ch[i]);
			}
			else
			{
			 value=h.get(ch[i]);
				value++;
				
			}
			
		}
		System.out.println(value);
	}

}
