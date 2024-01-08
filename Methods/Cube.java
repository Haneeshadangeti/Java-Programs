package Methods;

import java.util.Scanner;

public class Cube {
	public static int Cube1(int num)//creating the method with 1 parameter and returning a value
	{
		return num*num*num;//calculating the cube of the number
	}


	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
		int num=scan.nextInt();//creating a variable
		System.out.println(" the cube of the number is:"+Cube1(num));//printing the method
		scan.close();
	}
		

	}


