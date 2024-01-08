package Control_Constructors;
import java.util.Scanner;

public class Program11_ChildApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);//creating a object for scanner class
	System.out.println("enter a age");
	int age=scan.nextInt();//creating a variable
	Program11_Child p=new Program11_Child();//creating a object
	p.display(age);//invoking a method

	}

}
