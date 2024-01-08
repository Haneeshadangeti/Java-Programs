package Methods;

import java.util.Scanner;

public class Halve_It {
	public static double halvethenumber(double num)//creating the method with 1 parameter and returning a value
	{
		return num/2;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
	   double num=scan.nextDouble();//creating a variable
	   Halve_It p1=new  Halve_It();//creating a object
		System.out.println("the halve of the numbers is : "+p1.halvethenumber(num));//invoking a method
		scan.close();

	}

}
