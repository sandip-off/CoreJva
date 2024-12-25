package logicalprogram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Fetcheven {
public static void main(String[] args) {
	String s="heeellloo";
	char [] ch=s.toCharArray();
	LinkedHashMap<Character,Integer> x=new LinkedHashMap<Character,Integer>();
	for (int i=0;i<s.length();i++)
	{
		if(ch[i] =='a'||ch[i]== 'e' ||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			
			if (!x.containsKey(ch[i]))
			{
				x.put(ch[i], 1);
			}
			else
			{
				int value=x.get(ch[i]);
				value++;
				x.put(ch[i], value);
			}
		}
		
	}
	for(Entry <Character,Integer> o:x.entrySet() )
	{
		System.out.println(o.getKey()+" "+o.getValue());
	}
}
}
