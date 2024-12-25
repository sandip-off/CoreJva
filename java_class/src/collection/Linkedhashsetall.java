package collection;

import java.util.LinkedHashSet;

public class Linkedhashsetall {
	public static void main(String[] args) {
		LinkedHashSet a= new LinkedHashSet();
		a.add(1);
		a.add("bye");
		LinkedHashSet b=new LinkedHashSet();
		b.add(20);
		b.add("bye");
		//b.addAll(a);
		//System.out.println(b);
		b.retainAll(a);
		System.out.println(b);
	}

}
