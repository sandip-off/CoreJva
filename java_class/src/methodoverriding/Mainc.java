package methodoverriding;
//method name should be same,their should be is a relationship signature should be same


class Youtube_v1
	{
	void disp()
	{
	System.out.println("dispaly only movies and vlogs ");
	}
	}
	class Youtube_v2 extends Youtube_v1
	{
	void disp()
	{
	super.disp();
	System.out.println("dispaly  reels and shorts also ");


	}

	}
	class Mainc
	{
		public static void main (String[]args)
		{
	Youtube_v2 y1=new Youtube_v2();
	y1.disp();
		}

	}


