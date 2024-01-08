package Array_3D_Jagged;

import java.util.Scanner;

public class Array_3D_Jagged {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				
				System.out.println("enter the number of cities:");
				int city=scan.nextInt();//creating a variable
				float [][][]arr1=new float[city][][];//creating 3D array
			
				for(int i=0;i<=arr1.length-1;i++)//creating a variable to take userInput
				{
					System.out.println("enter a number of companies:"+i);
					int companies=scan.nextInt();
					arr1[i]=new float[companies][];
				}
				for(int i=0;i<=arr1.length-1;i++)//creating a variable to take userInput
				{
					for(int j=0;j<=arr1[i].length-1;j++)
					{
					System.out.println("enter the number of employees in" +(i+1)+ " city"+(j+1)+" company:");
					int employee=scan.nextInt();
					arr1[i][j]=new float[employee];
				    }
				}
		
				for(int i=0;i<=arr1.length-1;i++)//to store elements
				{
					for(int j=0;j<=arr1[i].length-1;j++)
					{
						for(int k=0;k<=arr1[i][j].length-1;k++)
						{
							System.out.println("enter the salary of "+(k+1)+"employee in "+(j+1)+"companies in"+(i+1)+"cities:");
							arr1[i][j][k]=scan.nextFloat();
						}
					}
				}
				for(int i=0;i<=arr1.length-1;i++)//to display elements
				{
					for(int j=0;j<=arr1[i].length-1;j++)
					{
						for(int k=0;k<=arr1[i][j].length-1;k++)
						{
							System.out.println("the salary of "+(k+1)+"employee in "+(j+1)+"company in"+(i+1)+"city:"+arr1[i][j][k]);
						
						}
					}
				}
				scan.close();


			

		

	}

}
