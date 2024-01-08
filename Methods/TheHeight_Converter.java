package Methods;

import java.util.Scanner;

public class TheHeight_Converter
{
	public double heightconverter(double inches)//creating the method with 1 parameter and returning a value
	{
		return inches/12;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
	   double inches=scan.nextInt();//creating a variable
	   TheHeight_Converter p1=new TheHeight_Converter();//creating a object
		System.out.println("the height converter: "+p1.heightconverter(inches));//invoking a method
		scan.close();

	}

}
