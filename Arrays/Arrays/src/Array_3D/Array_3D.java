package Array_3D;

import java.util.Scanner;

public class Array_3D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of schools:");
		int school=scan.nextInt();//creating a variable
		System.out.println("enter the number of classrooms:");
		int classrooms=scan.nextInt();//creating a variable
		System.out.println("enter the number of students:");
		int students=scan.nextInt();//creating a variable
		int [][][]arr1=new int[school][classrooms][students];//creating a 3D array
		for(int i=0;i<=arr1.length-1;i++)//to store a elements
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				for(int k=0;k<=arr1[i][j].length-1;k++)
				{
					System.out.println("enter the age of "+(k+1)+"student in "+(j+1)+"classrooms in"+(i+1)+"school:");
					arr1[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<=arr1.length-1;i++)//to display the elements
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				for(int k=0;k<=arr1[i][j].length-1;k++)
				{
					System.out.println("the age of "+(k+1)+"student in "+(j+1)+"classrooms in"+(i+1)+"school:"+arr1[i][j][k]);
				
				}
			}
		}
		scan.close();


	}

}
