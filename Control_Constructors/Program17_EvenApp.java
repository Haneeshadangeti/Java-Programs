package Control_Constructors;
import java.util.Scanner;

public class Program17_EvenApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//creating a variable
		Program17_Even p=new Program17_Even();//creating a object
		p.display(n);//invoking a method

	}

}
