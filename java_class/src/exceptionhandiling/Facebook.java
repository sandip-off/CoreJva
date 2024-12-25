package exceptionhandiling;

 class Facebook 
 
 {
	
	static void signin() throws FacebookException
	{
		int age=12;
		if (age>=13)
		{
			
			System.out.println("welcome to facebook");
		}
		else 
		{
			throw  new FacebookException("can't sign in plese come after ");
		}
		
	}


	
	
	
	public static void main(String[] args) 
	{
		
		try {
			signin();
		}
		catch(FacebookException e)
		{
			System.out.println(e.get());
		}
		
	}
	}


	class FacebookException extends Exception
	{
		String msg;
		FacebookException(String msg)
		{
			this.msg=msg;
		}
		 String get()
		{
			return msg;
		}
		
		
	}
		
