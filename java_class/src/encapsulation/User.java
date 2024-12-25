package encapsulation;

 class User {

	public static void main(String[] args) {
		
		Facebook f= new Facebook();
		System.out.println(f.get());
		f.set("hello999");
		System.out.println(f.get());
		
	}
}
