package Array_Merge;

import java.util.Scanner;

public class Array_Merge {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a numbers");

		int row=scan.nextInt();
		int []arr1=new int[row];
		for(int i=0;i<=arr1.length-1;i++)//to store the values
		{
			System.out.println("enter the number in"+i+"index");
			arr1[i]=scan.nextInt();

		}
		for(int i=0;i<=arr1.length-1;i++)//to display the values
		{
			System.out.println("the number in"+i+"index:"+arr1[i]);		
		}
		int []arr2=new int[row];//creating another array
		for(int i=0;i<=arr2.length-1;i++)//to store the values
		{
			System.out.println("enter the number in"+i+"index");
			arr2[i]=scan.nextInt();
		}
		System.out.println("array elements");
		
		for(int i=0;i<=arr2.length-1;i++)//to display the values
		{
			System.out.println("the number in"+i+"index:"+arr2[i]);		
		}
		Array_Merge1 arraymerge=new Array_Merge1();
		int []res=arraymerge.display(arr1, arr2);
		System.out.println("After merging elements");
		for(int x: res)
		{
			System.out.print(x+" ");
		}
		
		
	}
}






