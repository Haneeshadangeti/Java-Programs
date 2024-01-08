package Number_Programs;
import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		
		// creating the object of a scanner class
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a number1");
				int num1=scan.nextInt();//initializing the variable
				System.out.println("enter a number2");
				int num2=scan.nextInt();//initializing the variable
				scan.close();
				GCD g=new GCD ();//creating a object
				g.display(num1,num2);//invoking a method

	
	}

}
