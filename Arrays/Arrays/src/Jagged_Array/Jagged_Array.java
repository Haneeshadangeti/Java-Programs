package Jagged_Array;
import java.util.Scanner;
public class Jagged_Array {
	public static void main(String[] args) {
		//creating a object for scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of company:");
		int company=scan.nextInt();
		String [][]arr=new String[company][];//creating an array
		for(int i=0;i<=arr.length-1;i++)//jagged array
		{
			System.out.println("enter the number of employees in "+(i+1)+" company:");
			int emp=scan.nextInt();
			arr[i]=new String[emp];//creating a 1D array
		}
		for(int i=0;i<=arr.length-1;i++)//storing a values
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the name of employee"+(j+1)+ "in "+(i+1)+" company:");
				arr[i][j]=scan.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++)//displaying a values
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the name of employee"+(j+1)+" in "+(i+1)+" company:"+arr[i][j]);		
			}
		}
		scan.close();
		}
	
}
		
		