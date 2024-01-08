package Control_Constructors;
import java.util.Scanner;

public class Program12_PolygonApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//creating a object for scanner class
	System.out.println("enter a sides");
	int sides=scan.nextInt();//creating a variable
	Program12_Polygon p=new Program12_Polygon();//creating a object
	p.display(sides);//invoking  a method

	}

}
