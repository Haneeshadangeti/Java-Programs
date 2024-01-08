package Methods;

import java.lang.Math;
import java.util.Scanner;

public class Spacecraft_Thrust_Control {
	public static long thrust(long throttle)//creating the method with 1 parameter and returning a value
	{
		return ((long)Math.pow(throttle,10));
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
	   long throttle=scan.nextLong();//creating a variable
		System.out.println("the calculation of thrust is: "+thrust(throttle));//invoking a method
			scan.close();
		}
		
		
		

	}


