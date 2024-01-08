package Pattern_Programs;
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
        System.out.println("enter a character");
		char ch=scan.next().charAt(0);//creating a variable
		scan.close();//closing the scanner class
		display(n,ch);//invoking the method
	}
		public static void display(int n,char ch)//creating a method with 2 parameters
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)//loop for to print spaces
				{
					System.out.print(" ");
				}
				for(int k=1;k<=n-i+1;k++)//loop for to print character
				{
					System.out.print(ch);
				}
				
				for(int h=1;h<=(n-i);h++)//loop for to print character
				{
					System.out.print(ch);
				}
				System.out.println();
		}}
}
