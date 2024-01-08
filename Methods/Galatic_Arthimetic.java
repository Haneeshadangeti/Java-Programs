package Methods;
import java.util.*;
public class Galatic_Arthimetic{
	
	public static long galaticArthimetic(long num1,long num2)//creating a method with 2 parameters and returning a value
	{
		return num1+num2;//perform addition
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object from scanner class
		System.out.println("enter a number");
		long num1=scan.nextLong();//creating a variable
		System.out.println("enter a number");
		long num2=scan.nextLong();//creating a variable
		System.out.println("the arthimetic is : "+galaticArthimetic( num1, num2));//invoking the method
	scan.close();

	}

}
