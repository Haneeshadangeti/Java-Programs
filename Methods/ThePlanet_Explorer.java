package Methods;

import java.util.Scanner;

public class ThePlanet_Explorer {
	public double planet(double radius)//creating a method with 1 parameter and returning a value
	{
		return 4*3.14*radius*radius*2;//calculating the area
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
		double radius=scan.nextDouble();//creating a variable
		ThePlanet_Explorer p1=new ThePlanet_Explorer();//creating a object
		System.out.println(" the surface area of sphere : "+p1.planet(radius));//invoking a method
		scan.close();

	}

}
