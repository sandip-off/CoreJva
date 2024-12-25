package logicalprogram;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="LISTEN";
	String s2="SILENT";
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	if (ch1.length!=ch2.length)
	{
		System.out.println("its not a anagram ");
		System.exit(0);
	}
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	for(int i=0;i<s1.length();i++)
	{
	 if(ch1[i]!=ch2[i])
	 {
		 System.out.println("not a anagrm");
		 System.exit(0);
	 }
	
	
		
	}
	
	 
		 System.out.println("its a anagram");
	 
	
}
}
