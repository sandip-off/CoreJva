package logicalprogram;

public class RemoveConsonent {
	public static void main(String[] args) {
		
	
	String s="hello";
	//String a=s.replaceAll("[^aeiou]","");
	String a=s.replaceAll("[aeiou]","");
	System.out.println(a);
	}
}
