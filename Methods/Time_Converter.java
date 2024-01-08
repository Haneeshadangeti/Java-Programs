package Methods;
import java.util.Scanner;
public class Time_Converter {
	public static double converttohours(int numbers)//creating the method with 1 parameter and returning a value
	{
		double c=((double)(numbers/60));
		return c;
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a minutes");//creating a object for scanner class
		int numbers=scan.nextInt();//creating a variable
		scan.close();
		double a=Time_Converter.converttohours(numbers);//invoking a method
		System.out.println("the conversion of hours to minutes is: "+a);
	}
}
	