package Methods;

import java.util.Scanner;

public class  City_Planning_Simulator {
	public static int calculatePlotArea(int sideLength)//creating the method with 1 parameter and returning a value
	{
		return sideLength*sideLength;
	}

	public static double calculatePlotArea(double sideLength2)//creating the method with 1 parameter and returning a value
	{
		return sideLength2*sideLength2;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a sidelength");
		int sideLength =scan.nextInt();//creating a variable
		double sideLength2=scan.nextDouble();//creating a variable
		scan.close();
	   System.out.println("the plot area is :"+calculatePlotArea(sideLength));//invoking a method
		System.out.println("the plot area is :"+calculatePlotArea(sideLength2));//invoking a method
		

	}

}
