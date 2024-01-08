package Number_Programs;
import java.util.Scanner;

public class Square_Root_App {

	public static void main(String[] args) {
		// creating the object of a scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();//initializing the variable
		Square_Root s=new Square_Root();//creating a object
		s.display(num);//invoking a method
	}

}
