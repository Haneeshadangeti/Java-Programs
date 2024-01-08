package Array1;

import java.util.Scanner;

public class Array1D
{

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number of semesters:");
		int sem=scan.nextInt();//creating a variable
		
		boolean arr1[]=new boolean[sem];//type of array,size of array
		for(int i=0;i<=arr1.length-1;i++)//to store a elements
		{
			System.out.println("is there any backlogs in "+(i+1)+" semster :");
				arr1[i]=scan.nextBoolean();
		}
		for(int i=0;i<=arr1.length-1;i++)//to display a elements
		{
			
			System.out.println("the backlogs in "+(i+1)+" semster is:"+arr1[i]);
			
		}
		scan.close();
		

	}

}
