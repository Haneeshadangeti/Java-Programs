package Number_Programs;
import java.util.Scanner;

public class Palindrome_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object for scanner class
		System.out.println("enter a number");
		int n=scan.nextInt();//Initializing the variable
		
		scan.close();
		
		Palindrome p=new Palindrome();//creating the object
		p.display(n);//invoking the method


	}

}
