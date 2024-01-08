/*
*****@@@@@
*****@@@@@
*****@@@@@
*****@@@@@
*****@@@@@
*/
package Pattern_Programs;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();//creating the variable
        System.out.println("enter a first character");
		char ch1=scan.next().charAt(0);//creating the variable
		 System.out.println("enter a second character");
		char ch2=scan.next().charAt(0);//creating the variable
		display(num,ch1,ch2);//invoking the method
        scan.close();//closing the scanner class


	}
	public static void display(int num,char ch1,char ch2)//creating a method with 2 parameters
	{
		/*for(int i=1;i<=num;i++)
		{
			for (int j=1;j<=num;j++)
			{
				System.out.print(ch1);
			}
			for(int j=1;j<=num;j++)
			{
				System.out.print(ch2);
				
			}
			System.out.println();
		}*/
		/*int i=1;
		while(i<=num)
		{
			int j=1;
			while(j<=num)
			{
				System.out.print(ch1);
				j++;
			}
		     int k=1;
			while(k<=num)
			{
				System.out.print(ch2);
				k++;
			}
			i++;
			System.out.println();
		}*/
		int i=1;//intializing the varaible
		do {//using the do-while loop
			int j=1;
			do {
				System.out.print(ch1);
				j++;
			}while(j<=num);
			int k=1;
			do {
				System.out.print(ch2);
				k++;
			}while(k<=num);
			System.out.println();
			i++;
		}while(i<=num);
	}

}
