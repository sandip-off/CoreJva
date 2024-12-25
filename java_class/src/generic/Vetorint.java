package generic;

import java.util.Vector;

public class Vetorint {
	public static void main(String[] args) {
		Vector<Integer> s=new Vector<Integer>(); 
		s.add(10);
		s.add(2);
		s.add(99);
		s.add(0,9);
		System.out.println(s);
	
	}

}
