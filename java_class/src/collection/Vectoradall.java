package collection;

import java.util.Vector;

public class Vectoradall {
	public static void main(String[] args) {
		
	
	Vector v=new Vector();
	v.add("hey");
	v.add(90);
	Vector v1= new Vector();
	v1.add("bye");
	v1.add(29);
    v1.add(v);
   // System.out.println(v1);
    v1.addAll(1, v);
    System.out.println(v1);
	}

}
