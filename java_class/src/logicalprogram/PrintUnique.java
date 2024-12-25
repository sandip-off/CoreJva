package logicalprogram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintUnique {

	public static void main(String[] args) {
	String s="java";
	char[] ch=s.toCharArray();
	LinkedHashMap<Character,Integer> n = new LinkedHashMap<Character,Integer>();
	
	for(int i=0;i<s.length();i++)
	{
		if(!n.containsKey(ch[i]))
		{
			n.put(ch[i],1);
		}
		else {
			int value =n.get(ch[i]);
			value++;
			n.put(ch[i],value);
		}
	}
	for(Entry<Character,Integer> o:n.entrySet())
	{
		System.out.println(o.getKey()+" "+o.getValue());
		
	}

	}

}

