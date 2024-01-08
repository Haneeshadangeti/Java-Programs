import java.util.Scanner;

public class Hollow_Matrix {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row=scan.nextInt();//creating a variable
		System.out.println("enter the number of columns:");
		int col=scan.nextInt();//creating a variable
		int [][]arr=new int[row][col];//creating a 2D array
		for(int i=0;i<=arr.length-1;i++)//to store the values
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)//to display the values
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(i==0||i==arr.length-1||j==0||j==arr.length-1) //to print the hollow matrix
				{
				System.out.print(arr[i][j]+" ");
			    }
				else
				{
					System.out.print("    ");
				}
				
			}
			System.out.println();//to print the next line
		}
		scan.close();
	}
}

