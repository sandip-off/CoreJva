package generic;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Character> h = new HashSet<Character>();
		h.add('h');
		h.add('y');
		h.add('i');
		for (Character ch : h) {
			System.out.print(ch+" ");
		}
		HashSet<Object> o=new HashSet<Object>();
		 o.add("ho");
		 o.add(10);
		 o.add('H');
		 System.out.println(o);
	}

}
