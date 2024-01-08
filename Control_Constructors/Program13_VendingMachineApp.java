package Control_Constructors;
import java.util.Scanner;

public class Program13_VendingMachineApp{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a Product code");
		String product=scan.next();//creating  a variable
		Program13_VendingMachine p=new Program13_VendingMachine();//creating a object 
		p.display(product);//invoking a method

	}

}
