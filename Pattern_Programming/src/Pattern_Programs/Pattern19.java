/* 
-----*
----*-*
---*---*
--*-----*
-*********   */
package Pattern_Programs;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		scan.close();//closing the scanner class
		display(n,ch);//invoking the method
	}
		public static void display(int n,char ch)//creating a method with 2 parameter
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i+1;j++)//loop for to print spaces
				{
					System.out.print("-");
				}
				for(int k=1;k<=2*i-1;k++)//loop for to print character
				{
					if(i==1||i==n||k==1||k==2*i-1)//to print hollow triangle
					{
					System.out.print(ch);
				    }
					else
					{
						System.out.print("-");
					}
				}
				System.out.println();

			}
		
	}

}
