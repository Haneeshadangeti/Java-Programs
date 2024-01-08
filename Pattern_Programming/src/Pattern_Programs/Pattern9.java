/*
-*
--**
---***
----****
-----*****
*/
package Pattern_Programs;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating the variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating the variable
		scan.close();//closing the scanner class
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)//loop for print spaces
			{
		
			System.out.print("-");
			}
		for(int k=1;k<=i;k++)//loop for print characters
		
		{
			System.out.print(ch);
		}
       System.out.println();
	}

}}
