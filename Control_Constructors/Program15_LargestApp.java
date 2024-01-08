package Control_Constructors;
import java.util.Scanner;

public class Program15_LargestApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter first number");
		int num1=scan.nextInt();//creating a first variable
		System.out.println("enter second number");
		int num2=scan.nextInt();//creating a second variable
		System.out.println("enter third number");
		int num3=scan.nextInt();//Creating a third variable
		 Program15_Largest p=new  Program15_Largest ();
		 p.display(num1, num2, num3);
		


	}

}
