/*
* 
* * 
* * * 
* * * * 
* * * * * 
 */
package Pattern_Programs;

import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();//creating the variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		display(num,ch);//invoking the method
        scan.close();//closing the scanner class

	}
	public static void display(int num,char ch)//creating a method with 2 parameters
	{
		/*for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				System.out.print(" ");
			}
			System.out.println();
		}*/
		/*int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}
			i++;
			System.out.println();
		}*/
		int i=1;//intializing the variable
		do {//do-while loop
			int j=1;
			do {
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=num);
		
	}

}
