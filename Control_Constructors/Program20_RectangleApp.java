package Control_Constructors;
import java.util.Scanner;

public class Program20_RectangleApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//creating a object for scanner class
	System.out.println("enter a length");
	double length=scan.nextDouble();//creating a 1st variable
	System.out.println("enter a width");
	double width=scan.nextDouble();//creating a 2nd variable
	 Program20_Rectangle p=new  Program20_Rectangle();//creating a object
	System.out.println( p.CalculateRectangleArea(length,width));//invoking a method

	}

}
