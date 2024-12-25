package generic;

import java.util.ArrayList;
import java.util.Collections;

public class AL_St {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("hello");
		a.add("hi");
		a.add("bye");
		/////////a.add(1);
	    Collections.sort(a,Collections.reverseOrder());
System.out.println(a);
		
	}

}
