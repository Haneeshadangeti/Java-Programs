package Control_Constructors;
import java.util.Scanner;

public class Program14_Rect_SquareApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object of scanner class
		System.out.println("enter a length");
		int l=scan.nextInt();//Creating a first variable
		System.out.println("enter a breadth");
		int b=scan.nextInt();//creating a second variable
		Program14_Rect_Square p=new Program14_Rect_Square();//creating a object
		p.display(l,b);//invoking the method

	}

}
