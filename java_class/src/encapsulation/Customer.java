package encapsulation;

public class Customer {
	public static void main(String[] args) {
		Bank b= new Bank();
		System.out.println(b.get());
		b.set(99909);
		System.out.println(b.get());
	}

}
