package Number_Programs;
import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a object for scanner class
	      Scanner scan=new Scanner(System.in);
	       System.out.println("enter a number");
	        int num=scan.nextInt();//initializing a variable
	        int num1=0;
	        int num2=1;
	        Fibonacci F=new Fibonacci();//creating a object
	        F.display(num,num1,num2);//invoking a method

	}

}
