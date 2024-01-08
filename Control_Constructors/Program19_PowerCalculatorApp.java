package Control_Constructors;
import java.util.Scanner;

public class Program19_PowerCalculatorApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);//creating a object for scanner class
	System.out.println("enter a base");
	int base=scan.nextInt();//creating a 1st variable
	System.out.println("enter a exponent");
	int exponent=scan.nextInt();//creating a second variable
	Program19_PowerCalculator p=new Program19_PowerCalculator();//creating a object
	System.out.println(p.Calculator(base,exponent));//invoking a method
	
	

	}

}
