package collection;
import java.util.ArrayList;

public class ArrList_AddAll {

	public static void main(String[] args) {
				ArrayList a= new ArrayList();
				a.add(1);
				a.add("bye");
				ArrayList b=new ArrayList();
				b.add(20);
				b.add("bye");
				//b.addAll(a);
				//System.out.println(b);
				//b.add(1, a);
				//System.out.println(b);
				//b.removeAll(a);
				b.retainAll(a);
				System.out.println(b);
				
				
			}

		}


	


