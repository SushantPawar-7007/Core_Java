import java.util.Scanner;
public class Test2DArray {
	
	public static void AcceptData(int [][] arr)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
		  for(int j=0;j<arr[i].length;j++)
		  {
			  arr[i][j]=sc.nextInt();
		  }
		}
	}
	
	public static void DisplayData(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Entered Array is:");
				System.out.print(arr[i][j]+"\t");
				
			}
			 System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= new int [3][3];
		Test2DArray.AcceptData(arr);
		Test2DArray.DisplayData(arr);
	}

}
