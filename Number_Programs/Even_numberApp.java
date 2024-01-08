package Number_Programs;
import java.util.Scanner;

public class Even_numberApp {

	public static void main(String[] args) {
		//creating a object for scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		scan.close();
		int n=scan.nextInt();//Initializing the variable
	  Even_Number E =new Even_Number();//creating a object
		E.display(n);//invoking a method

	}

}
