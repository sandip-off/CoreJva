package collection;


import java.util.HashSet;

public class Hashsetadd {
	public static void main(String[] args) {
		HashSet a= new HashSet();
		a.add(1);
		a.add("hello");
		a.add("bye");
		
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		
		
		
	}

}
