package Number_Programs;
import java.util.Scanner;

public class Largest_Digits_App {

	public static void main(String[] args) {
	
		  Scanner scan=new Scanner(System.in);//creating a object for scanner class
	       System.out.println("enter a number");
	          int num=scan.nextInt();//creating a variable
	          scan.close();
	          Largest_Digits L=new Largest_Digits();//creating a object
	          L.display(num);//invoking a method

	}

}
