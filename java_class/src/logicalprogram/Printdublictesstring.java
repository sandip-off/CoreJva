package logicalprogram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Printdublictesstring {
	public static void main(String[] args) {
		int count=0;
		String s="hheelloo";
		char[] ch=s.toCharArray();
	LinkedHashMap<Character,Integer> n = new LinkedHashMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(!n.containsKey(ch[i]))
		{
			n.put(ch[i],1);
		}
		else
		{
			count++;
			System.out.println(ch[i]);
		}
		
	}
	System.out.println(count);
	
}
}