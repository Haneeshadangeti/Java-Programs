package Methods;

import java.util.Scanner;

public class Temperature {
	double f;
	public double convertcelsiustofahernheit(double f)//creating a method with 1 parameters and returning a value
	{
		double c;
		return c=(f-32)*5/9;//calculating the temperature
	}

	public  void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object from scanner class
		System.out.println("enter a number");
		double f=scan.nextDouble();//creating a variable
		Temperature t1= new Temperature();//creating a object
		System.out.println(t1.convertcelsiustofahernheit(f));//invoking the method
		scan.close();
		
		

	}

}
