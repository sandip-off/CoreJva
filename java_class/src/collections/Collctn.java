package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collctn {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("ahky babe");
		a.add("bhi");
		a.add("cbye");
		Collections.sort(a,Collections.reverseOrder());
		//System.out.println(a);
		//boxing

		int b=22;
		Integer x=Integer.valueOf(b);
		System.out.println(x);
		//unboxing
		Integer i =new Integer(22);
		int z=i;
		System.out.println(z);
		
		for (String s : a) {
			System.out.print(s+" ");
			
		}
		
	}

}
