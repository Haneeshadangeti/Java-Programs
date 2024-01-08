package Control_Constructors;
import java.util.Scanner;

public class Program21_FactorialApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		Program21_Factorial p=new Program21_Factorial();
		p.display(n);
	}
}
	
