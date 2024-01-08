/*
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 */
package Pattern_Programs;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		display(n,ch);//invoking the method
        scan.close();//closing the scanner class


	}
	public static void display(int n,char ch)//creating the method with 2 parameters
	{
		/*for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
			
			System.out.print(ch);
			System.out.print(" ");
		}
		System.out.println();
	}*/
		/*int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}
			i++;
			System.out.println();
		}*/
		int i=1;//intializing the value
		do {
			int j=1;
			do {//using do-while loop
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}
			while(j<=n);
			System.out.println();
			i++;
		}
		while(i<=n);
		
	}
}
