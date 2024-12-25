package logicalprogram;

public class Arraysmlandlrge {
	public static void main(String[] args) {
		
	
	int[] arr= {90,29,139,20};
	int a= arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (a<arr[i])
		{
			a=arr[i];
			
		}
		
	}
	System.out.println(a);
	for (int i = 0; i < arr.length; i++) {
		if (a>arr[i])
		{
			a=arr[i];
			
		}
		
	

	}
	System.out.println(a);
}
}
