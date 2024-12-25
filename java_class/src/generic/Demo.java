package generic;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList<String> a= new ArrayList<String>();
	a.add("hello");
	a.add("hi");
	a.add("bye");
	System.out.println(a);
	for (String y : a) {
		System.out.println(y);
	}
}
}
