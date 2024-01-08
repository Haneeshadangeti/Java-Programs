/*
* 
* * 
* * * 
* * * * 
* * * * * 
*/
package Pattern_Programs;

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();//creating the variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating the variable
		display(num,ch);//invoking the method
        scan.close();//closing the scanner class

	}
	public static void display(int num,char ch)//creating a method with 2 parameters
	{
		/*for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=(num-i+1);j++)
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
			while(j<=(num-i+1))
			{
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		int i=1;//intializing the variable
		do {//using do-while loop
			int j=1;
			do {
				System.out.print(ch);
				System.out.print(" ");
				j++;
			}while(j<=(num-i+1));
			i++;
			System.out.println();
		}while(i<=num);
	}

}
