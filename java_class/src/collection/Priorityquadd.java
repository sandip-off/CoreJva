package collection;

import java.util.PriorityQueue;

public class Priorityquadd {
	public static void main(String[] args) {
		
	
	PriorityQueue p=new PriorityQueue();
	p.add("hello");
	p.add("hi");
	System.out.println(p);
	Object A = p.peek();
	System.out.println(A);
	Object b = p.poll();
	System.out.println(p);
	
	
	}
}
