/*
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
* * * * * * * * * * 
 
  */
package Pattern_Programs;

import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a row");
		int row=scan.nextInt();//creating a variable
		System.out.println("enter a coloumn");
		int coloumn=scan.nextInt();//creating a variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		display(row,coloumn,ch);//invoking a method
        scan.close();//closing a scanner method
	}
	public static void display(int row,int coloumn,char ch)//creating a method with 3 parameters
	{
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=coloumn;j++)
			{
				System.out.print(ch);
				System.out.print(" ");
			}
			System.out.println();
		}*/
		/*int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=coloumn)
			{
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		int i=1;//initializing the variable
		do {//using a do-while loop
			int j=1;
			do {
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}while(j<=coloumn);
			System.out.println();
			i++;
		}
		while(i<=row);
	}

}
