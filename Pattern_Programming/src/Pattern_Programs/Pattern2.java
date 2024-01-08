/*
 * 
 * 
 * 
 * 
 */
package Pattern_Programs;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		display(n,ch);//invoking a method
        scan.close();//closing the scanner class

	}
	public static void display(int n,char ch)//creating a method with two parameters
	{
		/*for(int i=1;i<=n;i++)
		{
			System.out.println(ch);
		}*/
		/*int i=1;
		while(i<=n)
		{
			System.out.println(ch);
			i++;*/
		int i=1;//intializing the value
		do {//using do-while loop
			System.out.println(ch);
			i++;
		}while(i<=n);
	}

}
