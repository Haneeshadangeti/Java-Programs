package Number_Programs;
import java.util.Scanner;

public class Sum_Digits_Until_Single_App {

	public static void main(String[] args) {
		
		// creating the object of a scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();//initializing the variable
		Sum_Digits_Until_Single s=new Sum_Digits_Until_Single ();//creating a object
		s.display(num);//invoking a method


	}

}
