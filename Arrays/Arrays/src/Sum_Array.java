import java.util.Scanner;

public class Sum_Array {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row=scan.nextInt();//creating a variable
		System.out.println("enter the number of columns:");
		int col=scan.nextInt();//creating a variable
		int [][]arr=new int[row][col];//creating a 2D array 
		for(int i=0;i<=arr.length-1;i++)//to store array
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)//to display array
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the number in "+(j+1)+" column"+(i+1)+"rows:"+arr[i][j]);
			}
		}
		int sum=0;//Initializing the variable
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) 
				{
			sum+=arr[i][j];//sum of the elements in the array
		}
			
		}
		System.out.println("the sum of all the numbers presnet in array is:"+sum);
		scan.close();
}
}
