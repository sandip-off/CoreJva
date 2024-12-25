package collection;

import java.util.HashSet;

public class HashSetall {
	public static void main(String[] args) {
		
	
	HashSet a= new HashSet();
	a.add(1);
	a.add(22);
	HashSet b=new HashSet();
	b.add(20);
	b.add(99);
	b.addAll(a);
	System.out.println(b);
	
	
	}
}
