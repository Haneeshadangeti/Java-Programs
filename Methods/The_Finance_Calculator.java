package Methods;

import java.util.Scanner;

public class The_Finance_Calculator{
	public double financecalculator(double principle,double rate,double time)//creating the method with 3 parameter and returning a value
	{   
		
		return  principle*rate*time;
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//creating a object for scanner class 
		System.out.println("enter a number:");
	   double principle=scan.nextDouble();//creating a variable
	   double rate=scan.nextDouble();//creating a variable
	   double time=scan.nextDouble();//creating a variable
	   The_Finance_Calculator p1=new The_Finance_Calculator();//creating a object
		double l=p1.financecalculator(principle,rate,time);//invoking a method
		System.out.println("the finance calculator is : "+l);
		scan.close();
		
		

	}

}
