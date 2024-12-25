package maps;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		
	
	HashMap<String, Object> n = new HashMap<String,Object>();
	n.put("Username","Sandip");
	n.put("Mobile Number", 93809275);
	System.out.println(n);
	System.out.println(n.get("Username"));
	/* Mainly used methods are 
	 * put to add value and key
	 * get to get the value 
	 * by passing the key
	 */
	}
}
