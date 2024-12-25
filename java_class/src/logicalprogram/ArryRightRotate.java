package logicalprogram;

public class ArryRightRotate {
 public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	int last=arr[arr.length-1];
	for (int i=arr.length-1;i>=1;i--)
	{//left rotate;i=0;i<arr.length-1;i++;
		//arr[i]=arr[i+1];
		arr[i]=arr[i-1];
		
		
	}
	arr[0]=last;
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		
	}
}
}
