package logicalprogram;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Dublicates {
	public static void main(String[] args) {
		String s="helloeeeooo";
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			if (!l.contains(ch[i]))
			{
			l.add(ch[i]);
			}
		}
		System.out.println(l);
		
	}

}
