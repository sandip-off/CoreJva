package generic;

import java.util.PriorityQueue;

public class PQueue {
	public static void main(String[] args) {
		PriorityQueue<Double> o = new PriorityQueue<Double>();
		o.add(19.0);
		o.add(29.0);
		o.add(95.0);
		for (Double o1 : o) {
			System.out.print(o1+" ");
			
		}
	}

}
