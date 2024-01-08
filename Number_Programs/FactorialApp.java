package Number_Programs;
import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		
		//creating a object for scanner class
	      Scanner scan=new Scanner(System.in);
	       System.out.println("enter a number");
	        int num=scan.nextInt();//initializing a variable
	        scan.close();
	        Factorial F=new Factorial();//creating a object
	        F.display(num);//invoking a method


	}

}
