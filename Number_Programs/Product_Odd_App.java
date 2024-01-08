package Number_Programs;
import java.util.Scanner;

public class Product_Odd_App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating the object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//Initializing the variable
		scan.close();
		Product_Odd p=new Product_Odd();//creating the object
		p.display(n);//invoking the method

	}

}
