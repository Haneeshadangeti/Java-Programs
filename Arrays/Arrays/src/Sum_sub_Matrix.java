import java.util.Scanner;

public class Sum_sub_Matrix {
	Scanner scan=new Scanner(System.in);
	void Matrix1(int arr1[][])
	{
		
		for(int i=0;i<=arr1.length-1;i++)//to store a values
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr1[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr1.length-1;i++)//to display a values
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	void matrix2(int arr2[][])//to store a values
	{
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.println("enter the numbers in"+(i+1)+" row and "+(j+1)+"colomn:");
				arr2[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr2.length-1;i++)//to display a values
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	void matrixsum(int arr1[][],int arr2[][],int arr3[][])
	{
		System.out.println("the sum of the matrix1 and matrix2 is:");
		for(int i=0;i<=arr1.length-1;i++)//sum of two arrays
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();		
		}

	}
	void matrixsub(int arr1[][],int arr2[][],int arr3[][]) {
	System.out.println("the subtraction of the matrix1 and matrix2 is:");
	for(int i=0;i<=arr1.length-1;i++)
	{
		for(int j=0;j<=arr1[i].length-1;j++)
		{
			arr3[i][j]=arr1[i][j]-arr2[i][j];//subtraction of two arrays
			System.out.print(arr3[i][j]);
		}
		System.out.println();	
	}
	
	}
}
