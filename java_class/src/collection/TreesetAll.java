package collection;

import java.util.TreeSet;
/*add
 * addAll
 * remove
 * removeAll
 * retainAll
 * Size
 * Contain
 
 * 
 */

public class TreesetAll {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(20);
		t.add(10);
		t.add(90);
	System.out.println(t);//auto sort
	TreeSet t1=new TreeSet();
	t1.add(20);
	t1.add(95);
	t1.add(20);
//t1.addAll(t);
	//System.out.println(t1);
//t1.retainAll(t);
	//System.out.println(t1);
//t1.remove(20);
	//System.out.println(t1);
//t1.removeAll(t1);
	//System.out.println(t1);
int a=t1.size();//size will be 2 because it doesnot allows dublicates
    System.out.println(a);
boolean b=t1.contains(20);
System.out.println(b);
	
	
	
	}

}
