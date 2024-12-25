package logicalprogram;

public class Bubblesor {
	public static void main(String[] args) {
		
	
	int[] arr= {1,2,15,30,5,6,11};
	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		
	}
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[j] +" ");
	}
	
	}
	

}
