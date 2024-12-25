package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Ascding {
	public static void main(String[] args) {
		
	
	ArrayList x= new ArrayList();
	x.add(1);
	x.add(22);
	x.add(99);
	//Collections.sort(x);
	Collections.sort(x, Collections.reverseOrder());
	System.out.println(x);
	Collections.shuffle(x);
	System.out.println(x);
	}
}
