import java.util.Scanner;

public class Sum_2_Matrix {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row=scan.nextInt();
		System.out.println("enter the number of columns:");
		int col=scan.nextInt();
		int [][]arr1=new int[row][col];
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr1[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int [][]arr2=new int[row][col];
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr2[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		int arr3[][]=new int[row][col];
		System.out.println("the sum of the matrix1 and matrix2 is:");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]);
			}
			System.out.println();		
		}
		scan.close();
	}

}
