package generic;

public class Bubblesort {
public static void main(String[] args) {
	int []arr= {1,9,5,4};
	for(int i=0;i<arr.length-1;i++)
{
		for(int j=0;j<arr.length-1;j++)
		{
			if (arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
}
	for (int x : arr) {
		System.out.print(x+" " );
	}
	
		/*for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
			
		}
		*/
}
}

