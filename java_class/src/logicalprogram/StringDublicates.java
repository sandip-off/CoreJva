package logicalprogram;


import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringDublicates {
	public static void main(String[] args) {
	
	String s="hello";
	char[] ch=s.toCharArray();
	LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
	
	
	for(int i=0;i<ch.length-1;i++)
	{
		if(!l.containsKey(ch[i]))
		{
			l.put(ch[i], 1);
		}
		else
		{
			int value=l.get(ch[i]);
			value++;
			l.put(ch[i],value);
			
		}
		for(Entry<Character,Integer> o:l.entrySet())
		{
			System.out.print(" "+o.getKey()+"-"+o.getValue());
		}
	}

}
}