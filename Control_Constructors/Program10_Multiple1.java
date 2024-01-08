package Control_Constructors;
import java.util.Scanner;

public class Program10_Multiple1 {
	public static void main(String[]args)//main method
	{
	Scanner scan=new Scanner(System.in);//Creating a object for scanner class
	System.out.println("enter a number");
	int num=scan.nextInt();//creating a variable
	Program10_Multiple2 p=new Program10_Multiple2();//creating a object 
	p.display(num);//invoking a method
	scan.close();

}
}