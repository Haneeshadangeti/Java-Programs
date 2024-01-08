package Number_Programs;
import java.util.Scanner;

public class Prime_App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//initializing the variable
		scan.close();//closing the scanner class
		Prime p=new Prime();//creating a object
		p.prime(n);//invoking the method

	}

}
