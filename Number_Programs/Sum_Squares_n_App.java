package Number_Programs;
import java.util.Scanner;

public class Sum_Squares_n_App {

	public static void main(String[] args) {
		// creating the object of a scanner class
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a number");
				int num=scan.nextInt();//initializing the variable
				Sum_Squares_n s=new Sum_Squares_n();//creating a object
				s.display(num);//invoking a method

	}

}
