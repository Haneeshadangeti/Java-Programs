package Number_Programs;
import java.util.Scanner;

public class CubeApp {

	public static void main(String[] args) {
		
		// creating the object of a scanner class
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a number");
				int num=scan.nextInt();//initializing the variable
				scan.close();
				Cube c=new Cube();//creating a object
				c.display(num);//invoking a method
	}

}
