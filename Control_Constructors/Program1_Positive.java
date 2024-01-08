package Control_Constructors;
import java.util.Scanner;

public class Program1_Positive {

	public static void main(String[] args) {//main method
		Scanner scan=new Scanner(System.in);//creating a object for scanner class
		System.out.println("enter a number");//printing message
		int num=scan.nextInt();//creating a variable
		Program1_Positive1 p1=new Program1_Positive1();//creating a object for Program1_Positive2
		p1.positive(num);//invoking a method
		scan.close();

	}

}
