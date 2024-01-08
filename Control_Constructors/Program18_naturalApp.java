package Control_Constructors;
import java.util.Scanner;

public class Program18_naturalApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object a scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		Program18_natural p=new Program18_natural();//creating a object
		p.display(n);//invoking a method

	}

}
