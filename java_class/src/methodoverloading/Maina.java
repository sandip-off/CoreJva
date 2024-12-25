package methodoverloading;
	class Bms
	{
	void book(int a)
	{
	System.out.println("booking the show by price"+a);
	}
	void book(String b)
	{
	System.out.println("booking the show by movie name: "+b);
	}
	void book (int c,String d)
	{
	System.out.println("booking the show by  price and movie name: "+c +d);
	}
	void book(String e,int f)
	{
	System.out.println("booking the show by  movie name andd price : "+e +f);
	}
	}
	class Maina
	{
	public static void main(String[]args)
	{
	Bms b1=new Bms();
	b1.book(100);
	b1.book("kgf");
	b1.book(100,"kgf");
	b1.book("kgf",100);

	}


//method name should be same 
	/* variation in the argument list 
	 * i. variation on the data type 
	 * ii. variation in the length of the argument
	 * iii.variation in order of occurance 
	 * iv. their is no restriction for acess specifier and modifier
	 * 
	 */




	}


