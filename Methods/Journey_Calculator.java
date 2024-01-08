package Methods;

import java.util.*;
public class Journey_Calculator {
	public double journeycalc(double speed,double time)//creating a method with 2 parametres and returning a value
	{
		return speed*time;//calculating journey
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a speed");
		double speed=scan.nextDouble();//creating a variable
		System.out.println("enter a time");
		double time=scan.nextDouble();//creating a variable
		scan.close();//closing the scanner class
		Journey_Calculator j=new Journey_Calculator();//creating a object 
		System.out.println("the distance is :"+j.journeycalc(speed,time));//invoking a method

	}

}
