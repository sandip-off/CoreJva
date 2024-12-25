package collection;

import java.util.LinkedList;


public class LinkedLstaddall {
public static void main(String[] args) {
	LinkedList v=new LinkedList();
	v.add("hey");
	v.add(90);
	LinkedList v1= new LinkedList();
	v1.add("bye");
	v1.add(29);
    v1.add(v);
   System.out.println(v1);
    v1.addAll(1, v);
    System.out.println(v1);
}
}
