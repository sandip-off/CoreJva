package generic;

import java.util.LinkedList;

public class linked {
	public static void main(String[] args) {
		
	
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(10);
	l.add(13);
	l.add(103);
	l.add(19);
	l.add(1);
	System.out.println(l);
	for (Integer i : l) {
		System.out.print(i+" ");
		
	}
	
	}
}
